package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 秒杀商品通知订阅
 */
@Data
public class SmsSeckillSkuNotice {
    /**
     * id
     */
    private Long id;

    /**
     * member_id
     */
    private Long memberId;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * 活动场次id
     */
    private Long sessionId;

    /**
     * 订阅时间
     */
    private Date subcribeTime;

    /**
     * 发送时间
     */
    private Date sendTime;

    /**
     * 通知方式[0-短信，1-邮件]
     */
    private Boolean noticeType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}