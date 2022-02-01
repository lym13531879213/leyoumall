package cn.com.mall.operator.pojo.dto.pms;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class AddCategoryDTO {

    @NotBlank(message = "商品分类名称不能为空")
    private String name;

    @NotBlank(message = "计量单位不能为空")
    private String productUnit;

    @NotNull(message = "排序不能为空")
    private Integer sort;

    @NotNull(message = "层级不能为空")
    private Integer catLevel;

    @NotNull(message = "显示状态不能为空")
    private Integer showStatus;

    @NotNull(message = "上一级ID不能为空")
    private Long parentCid;
}
