package cn.com.mall.service.impl;

import cn.com.mall.common.ResultCode;
import cn.com.mall.common.contanst.CommonContanst;
import cn.com.mall.config.auth.jwt.JwtToken;
import cn.com.mall.config.auth.jwt.JwtUtil;
import cn.com.mall.entity.OperateUser;
import cn.com.mall.mapper.OperateUserMapper;
import cn.com.mall.pojo.dto.operator.ModifyOperatorDTO;
import cn.com.mall.service.OperateUserService;
import cn.com.mall.utils.SaltUtil;
import com.github.pagehelper.PageHelper;
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
import java.util.List;
import java.util.Map;

@Service
public class OperateUserServiceImpl implements OperateUserService {

    @Resource
    private OperateUserMapper operateUserMapper;

    @Override
    public OperateUser getById(Long operatorId) {
        return operateUserMapper.getById(operatorId);
    }

    @Override
    public OperateUser getByUsername(String username) {
        return operateUserMapper.getByUsername(username);
    }

    @Override
    public boolean createOperator(Long operatorId, OperateUser operateUser) {
        String salt = SaltUtil.getSalt(32);
        String password = new Md5Hash(operateUser.getPassword(), salt, 1024).toHex();

        operateUser.setSalt(salt);
        operateUser.setPassword(password);

        return operateUserMapper.createOperator(operateUser);
    }

    @Override
    public String login(String username, String password) {
        OperateUser operator = this.getByUsername(username);
        if (ObjectUtils.isEmpty(operator)) {
            throw new RuntimeException(ResultCode.INVALID_USER.getMessage());
        }
        String salt = operator.getSalt();
        Md5Hash md5Hash = new Md5Hash(password, salt, 1024);
        Map<String, String> map = new HashMap<>();
        //??????token????????????
        map.put("operatorId", operator.getUserId().toString());

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
    public List<OperateUser> getPage(Object page, Long operatorId, String realName, String mobile, Integer status) {
        PageHelper.startPage(page);
        return operateUserMapper.getList(operatorId, realName, mobile, status);
    }

    @Override
    public boolean switchStatus(Long operatorId, Integer status) {
        return operateUserMapper.switchStatus(operatorId, status);
    }

    @Override
    public boolean deleteUser(Long operatorId) {
        return operateUserMapper.deleteUser(operatorId);
    }

    @Override
    public boolean modifyOperator(Long operatorId, ModifyOperatorDTO dto) {
        return operateUserMapper.modifyOperator(operatorId, dto.getEmail(), dto.getHeadImg(), dto.getMobile(), dto.getRealName(), dto.getUsername());
    }
}
