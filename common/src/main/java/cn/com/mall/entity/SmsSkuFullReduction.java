package cn.com.mall.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 商品满减信息
 */
@Data
public class SmsSkuFullReduction {
    /**
     * id
     */
    private Long id;

    /**
     * spu_id
     */
    private Long skuId;

    /**
     * 满多少
     */
    private BigDecimal fullPrice;

    /**
     * 减多少
     */
    private BigDecimal reducePrice;

    /**
     * 是否参与其他优惠
     */
    private Boolean addOther;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}