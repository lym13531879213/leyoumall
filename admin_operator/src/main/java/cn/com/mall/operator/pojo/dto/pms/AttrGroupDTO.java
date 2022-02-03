package cn.com.mall.operator.pojo.dto.pms;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author liaoyuming
 * @date 2022/2/3 15:37
 * @Description
 */
@Data
public class AttrGroupDTO {

    @NotNull(message = "分组id")
    private Long attrGroupId;

    @NotBlank(message = "组名不能为空")
    private String attrGroupName;

    @NotNull(message = "排序不能为空")
    private Integer sort;

    private String description;

    @NotNull(message = "所属分类id不能为空")
    private Long catId;

    @NotNull(message = "所属分类列表不能为空")
    private String cateIds;
}
