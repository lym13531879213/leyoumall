package cn.com.mall.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 退款信息
 */
@Data
public class OmsRefundInfo {
    /**
     * id
     */
    private Long id;

    /**
     * 退款的订单
     */
    private Long orderReturnId;

    /**
     * 退款金额
     */
    private BigDecimal refund;

    /**
     * 退款交易流水号
     */
    private String refundSn;

    /**
     * 退款状态
     */
    private Boolean refundStatus;

    /**
     * 退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
     */
    private Byte refundChannel;

    /**
     * 退货内容
     */
    private String refundContent;

    /**
     * 创建时间
     */
    private Date createTime;
}