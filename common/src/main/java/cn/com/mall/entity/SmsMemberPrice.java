package cn.com.mall.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 商品会员价格
 */
@Data
public class SmsMemberPrice {
    /**
     * id
     */
    private Long id;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * 会员等级id
     */
    private Long memberLevelId;

    /**
     * 会员等级名
     */
    private String memberLevelName;

    /**
     * 会员对应价格
     */
    private BigDecimal memberPrice;

    /**
     * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
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