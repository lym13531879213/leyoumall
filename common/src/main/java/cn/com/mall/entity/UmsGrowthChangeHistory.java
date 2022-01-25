package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 成长值变化历史记录
 */
@Data
public class UmsGrowthChangeHistory {
    /**
     * id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long memberId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 改变的值（正负计数）
     */
    private Integer changeCount;

    /**
     * 备注
     */
    private String note;

    /**
     * 积分来源[0-购物，1-管理员修改]
     */
    private Byte sourceType;
}