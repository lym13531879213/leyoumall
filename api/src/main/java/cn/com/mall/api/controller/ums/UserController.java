package cn.com.mall.api.controller.ums;

import cn.com.mall.api.controller.BaseController;
import cn.com.mall.api.pojo.dto.ums.ForgetDTO;
import cn.com.mall.api.pojo.dto.ums.LoginDTO;
import cn.com.mall.api.pojo.dto.ums.RegisterDTO;
import cn.com.mall.api.service.SendMessageService;
import cn.com.mall.api.service.UmsMemberService;
import cn.com.mall.common.EmailDTO;
import cn.com.mall.common.Result;
import cn.com.mall.common.ResultCode;
import cn.com.mall.common.enums.RedisEnum;
import cn.com.mall.utils.RandomUtil;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;

@RestController
@RequestMapping("user")
public class UserController extends BaseController {

    @Autowired
    private SendMessageService sendMessageService;

    @Autowired
    private UmsMemberService umsMemberService;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @GetMapping("message")
    public Result<String> getMessage(Integer type, @Validated @Email String email) {
        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setSubject("乐优购");
        emailDTO.setRecipient(email);
        emailDTO.setContent(RandomUtil.generateRandomString(6));
        //发送短信
        try {
            sendMessageService.sendMessage(RedisEnum.of(type).getKeyName(), emailDTO);
        } catch (NullPointerException e) {
            return Result.failure(ResultCode.FAIL, "发送邮件失败");
        }
        return Result.success();
    }

    @PostMapping("register")
    public Result register(@RequestBody @Validated RegisterDTO dto) {
        //验证验证码
        if (!sendMessageService.validateCode(RedisEnum.KEY_REGISTER.getKeyName(), dto.getEmail(), dto.getCode())) {
            return Result.failure(ResultCode.FAIL, "验证码错误");
        }
        boolean result = umsMemberService.register(dto.getEmail(), dto.getPassword());
        if (!result) {
            return Result.failure(ResultCode.FAIL, "注册失败");
        }
        //删除注册key
        String key = RedisEnum.KEY_REGISTER.getKeyName() + ":" + dto.getEmail();
        redisTemplate.delete(key);
        return Result.success();
    }

    @PostMapping("login")
    public Result login(@RequestBody @Validated LoginDTO dto) {
        //验证验证码
        if (!sendMessageService.validateCode(RedisEnum.KEY_LOGIN.getKeyName(), dto.getEmail(), dto.getCode())) {
            return Result.failure(ResultCode.FAIL, "验证码错误");
        }
        return Result.success(umsMemberService.login(dto));
    }

    @PostMapping("forget")
    public Result forgetPwd(@RequestBody @Validated ForgetDTO dto) {
        DecodedJWT token = super.getToken();
        long userId = Long.parseLong(token.getClaim("userId").asString());
        //验证验证码
        if (!sendMessageService.validateCode(RedisEnum.KEY_FORGET.getKeyName(), dto.getEmail(), dto.getCode())) {
            return Result.failure(ResultCode.FAIL, "验证码错误");
        }
        boolean result = umsMemberService.forgetPwd(userId, dto);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "找回密码失败");
        }
        return Result.success();
    }
}
