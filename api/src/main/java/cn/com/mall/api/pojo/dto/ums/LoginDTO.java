package cn.com.mall.api.pojo.dto.ums;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author liaoyuming
 * @date 2022/2/1 20:33
 * @Description
 */
@Data
public class LoginDTO {

    @Email(message = "不符合邮箱格式")
    @NotBlank(message = "邮箱不能空")
    private String email;

    @NotBlank(message = "密码不能为空")
    private String password;

    @NotBlank(message = "验证码不能为空")
    private String code;
}
