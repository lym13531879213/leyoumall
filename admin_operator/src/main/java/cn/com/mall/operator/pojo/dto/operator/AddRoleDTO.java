package cn.com.mall.operator.pojo.dto.operator;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class AddRoleDTO {
    @NotBlank(message = "角色名称不能为空")
    private String roleName;

    private String remark;

    @NotNull(message = "启用状态不能为空")
    private Integer status;
}
