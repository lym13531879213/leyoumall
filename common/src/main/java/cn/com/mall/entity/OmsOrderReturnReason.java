package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 退货原因
 */
@Data
public class OmsOrderReturnReason {
    /**
     * id
     */
    private Long id;

    /**
     * 退货原因名
     */
    private String name;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 启用状态
     */
    private Boolean status;

    /**
     * create_time
     */
    private Date createTime;
}