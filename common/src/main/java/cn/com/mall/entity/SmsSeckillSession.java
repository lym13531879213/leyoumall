package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 秒杀活动场次
 */
@Data
public class SmsSeckillSession {
    /**
     * id
     */
    private Long id;

    /**
     * 场次名称
     */
    private String name;

    /**
     * 每日开始时间
     */
    private Date startTime;

    /**
     * 每日结束时间
     */
    private Date endTime;

    /**
     * 启用状态
     */
    private Boolean status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}