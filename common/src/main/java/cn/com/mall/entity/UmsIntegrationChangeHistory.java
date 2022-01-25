package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 积分变化历史记录
 */
@Data
public class UmsIntegrationChangeHistory {
    /**
     * id
     */
    private Long id;

    /**
     * member_id
     */
    private Long memberId;

    /**
     * create_time
     */
    private Date createTime;

    /**
     * 变化的值
     */
    private Integer changeCount;

    /**
     * 备注
     */
    private String note;

    /**
     * 来源[0->购物；1->管理员修改;2->活动]
     */
    private Byte sourceTyoe;
}