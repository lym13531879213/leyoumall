package cn.com.mall.operator.pojo.dto.operator;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ModifyRoleDTO {
    @NotBlank(message = "角色名称不能为空")
    private String roleName;
    private String remark;
}
