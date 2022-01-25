package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 优惠券分类关联
 */
@Data
public class SmsCouponSpuCategoryRelation {
    /**
     * id
     */
    private Long id;

    /**
     * 优惠券id
     */
    private Long couponId;

    /**
     * 产品分类id
     */
    private Long categoryId;

    /**
     * 产品分类名称
     */
    private String categoryName;

    /**
     * 创建时间
     */
    private Date createTime;
}