package cn.com.mall.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 商品阶梯价格
 */
@Data
public class SmsSkuLadder {
    /**
     * id
     */
    private Long id;

    /**
     * spu_id
     */
    private Long skuId;

    /**
     * 满几件
     */
    private Integer fullCount;

    /**
     * 打几折
     */
    private BigDecimal discount;

    /**
     * 折后价
     */
    private BigDecimal price;

    /**
     * 是否叠加其他优惠[0-不可叠加，1-可叠加]
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