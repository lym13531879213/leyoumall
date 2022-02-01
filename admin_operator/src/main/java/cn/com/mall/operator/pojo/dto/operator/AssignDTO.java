package cn.com.mall.operator.pojo.dto.operator;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class AssignDTO {

    @NotNull(message = "分配id列表不能为空")
    private List<Long> ids;

    @NotNull(message = "操作对象id不能为空")
    private Long id;

}
