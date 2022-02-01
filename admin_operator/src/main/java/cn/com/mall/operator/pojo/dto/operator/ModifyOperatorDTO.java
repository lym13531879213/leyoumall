package cn.com.mall.operator.pojo.dto.operator;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ModifyOperatorDTO {
    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "真实姓名不能为空")
    private String realName;
    @NotBlank(message = "邮箱不能为空")
    private String email;
    @NotBlank(message = "手机号码不能为空")
    private String mobile;
    @NotBlank(message = "头像不能为空")
    private String headImg;

}
