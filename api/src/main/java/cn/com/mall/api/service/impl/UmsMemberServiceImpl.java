package cn.com.mall.api.service.impl;

import cn.com.mall.api.config.auth.jwt.JwtToken;
import cn.com.mall.api.config.auth.jwt.JwtUtil;
import cn.com.mall.api.mapper.UmsMemberMapper;
import cn.com.mall.api.pojo.dto.ums.ForgetDTO;
import cn.com.mall.api.pojo.dto.ums.LoginDTO;
import cn.com.mall.api.service.UmsMemberService;
import cn.com.mall.common.ResultCode;
import cn.com.mall.entity.UmsMember;
import cn.com.mall.utils.RandomUtil;
import cn.com.mall.utils.SaltUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Resource
    private UmsMemberMapper umsMemberMapper;

    @Override
    public UmsMember getById(Long userId) {
        return umsMemberMapper.getById(userId);
    }

    @Override
    public boolean register(String email, String password) {
        UmsMember umsMember = this.getUserByEmail(email);
        if (umsMember != null) {
            throw new RuntimeException("该邮箱已经被注册");
        }
        String salt = SaltUtil.getSalt(32);
        String pwd = new Md5Hash(password, salt, 1024).toHex();
        UmsMember user = new UmsMember();
        user.setSalt(salt);
        user.setPassword(pwd);
        user.setEmail(email);
        user.setNickname(RandomUtil.PREFIX + RandomUtil.generateRandomString(6));
        user.setHeader(RandomUtil.generateHeadPicture());
        return umsMemberMapper.register(user);
    }

    @Override
    public String login(LoginDTO dto) {
        UmsMember umsMember = this.getUserByEmail(dto.getEmail());
        if (ObjectUtils.isEmpty(umsMember)) {
            throw new RuntimeException(ResultCode.INVALID_USER.getMessage());
        }
        String salt = umsMember.getSalt();
        Md5Hash md5Hash = new Md5Hash(dto.getPassword(), salt, 1024);
        Map<String, String> map = new HashMap<>();
        //添加token中的信息
        map.put("userId", umsMember.getId().toString());

        String token = JwtUtil.getJwtToken(map, md5Hash.toHex());
        JwtToken jwtToken = new JwtToken(token);
        Subject subject = SecurityUtils.getSubject();

        try {
            subject.login(jwtToken);
            return token;
        } catch (UnknownAccountException e) {
            throw new RuntimeException(ResultCode.INVALID_USER.getMessage());
        } catch (IncorrectCredentialsException e) {
            throw new RuntimeException(ResultCode.ERROR_PASSWORD.getMessage());
        } catch (ExpiredCredentialsException e) {
            throw new RuntimeException(ResultCode.TOKEN_EXPIRED.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(ResultCode.FAIL.getMessage());
        }
    }

    @Override
    public UmsMember getUserByEmail(String email) {
        return umsMemberMapper.getUserByEmail(email);
    }

    @Override
    public boolean forgetPwd(Long userId, ForgetDTO dto) {
        String salt = SaltUtil.getSalt(32);
        String pwd = new Md5Hash(dto.getPassword(), salt, 1024).toHex();
        return umsMemberMapper.forgetPwd(userId,salt,pwd);
    }
}
