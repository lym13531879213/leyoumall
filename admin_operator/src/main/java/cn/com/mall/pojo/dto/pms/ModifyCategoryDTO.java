package cn.com.mall.pojo.dto.pms;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ModifyCategoryDTO {
    @NotBlank(message = "请输入分类名称")
    private String name;
    @NotBlank(message = "请输入计量单位")
    private String productUnit;
    @NotBlank(message = "请输入排序")
    private Integer sort;
}
