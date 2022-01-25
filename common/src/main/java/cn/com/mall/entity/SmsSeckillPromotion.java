package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 秒杀活动
 */
@Data
public class SmsSeckillPromotion {
    /**
     * id
     */
    private Long id;

    /**
     * 活动标题
     */
    private String title;

    /**
     * 开始日期
     */
    private Date startTime;

    /**
     * 结束日期
     */
    private Date endTime;

    /**
     * 上下线状态
     */
    private Byte status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Long userId;

    /**
     * 更新时间
     */
    private Date updateTime;
}