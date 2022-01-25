package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 库存工作单
 */
@Data
public class WmsWareOrderTaskDetail {
    /**
     * id
     */
    private Long id;

    /**
     * sku_id
     */
    private Long skuId;

    /**
     * sku_name
     */
    private String skuName;

    /**
     * 购买个数
     */
    private Integer skuNum;

    /**
     * 工作单id
     */
    private Long taskId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}