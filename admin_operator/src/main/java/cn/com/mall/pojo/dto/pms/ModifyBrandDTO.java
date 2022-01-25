package cn.com.mall.pojo.dto.pms;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ModifyBrandDTO {

    @NotBlank(message = "品牌名称不能为空")
    private String name;
    @NotBlank(message = "logo不能为空")
    private String logo;
    @NotBlank(message = "描述不能为空")
    private String description;
    @NotNull(message = "显示状态不能为空")
    private Integer showStatus;
    @NotNull(message = "排序不能为空")
    private Integer sort;
}
