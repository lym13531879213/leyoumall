package cn.com.mall.pojo.dto.pms;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class AddBrandDTO {
    @NotBlank(message = "名牌名称不能为空")
    private String name;
    @NotBlank(message = "名片logo不能为空")
    private String logo;
    @NotBlank(message = "介绍不能为空")
    private String description;
    @NotNull(message = "显示状态不能为空")
    private Integer showStatus;
    @NotBlank(message = "首字母不能为空")
    private String firstLetter;
    @NotNull(message = "排序不能为空")
    private Integer sort;

}
