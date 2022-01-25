package cn.com.mall.pojo.dto.operator;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author liaoyuming
 * @date 2022/1/3 11:29
 */
@Data
public class LoginDTO {
    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    private String password;
}
