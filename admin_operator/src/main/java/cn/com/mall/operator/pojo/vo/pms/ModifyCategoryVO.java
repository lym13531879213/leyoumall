package cn.com.mall.operator.pojo.vo.pms;

import lombok.Data;

@Data
public class ModifyCategoryVO {
    private Long catId;
    private String name;
    private String productUnit;
    private Integer sort;
}
