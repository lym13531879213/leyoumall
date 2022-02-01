package cn.com.mall.api.pojo.dto.ums;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class ForgetDTO {
    @Email(message = "不符合邮箱格式")
    @NotBlank(message = "邮箱不能空")
    private String email;

    @NotBlank(message = "密码不能为空")
    private String password;

    @NotBlank(message = "验证码不能为空")
    private String code;
}
