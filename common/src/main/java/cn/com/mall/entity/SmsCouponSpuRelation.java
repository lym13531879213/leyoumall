package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 优惠券与产品关联
 */
@Data
public class SmsCouponSpuRelation {
    /**
     * id
     */
    private Long id;

    /**
     * 优惠券id
     */
    private Long couponId;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * spu_name
     */
    private String spuName;

    /**
     * 创建时间
     */
    private Date createTime;
}