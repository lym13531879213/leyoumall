package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 品牌分类关联
 */
@Data
public class PmsCategoryBrandRelation {
    private Long id;

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

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}