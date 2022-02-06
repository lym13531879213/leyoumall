package cn.com.mall.operator.pojo.vo.pms;

import lombok.Data;

@Data
public class CategoryBrandRelationVO {

    private Long categoryBrandRelationId;

    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 分类id
     */
    private Long catelogId;

    private String brandName;

    private String catelogName;


}
