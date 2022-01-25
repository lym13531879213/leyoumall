package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 属性&属性分组关联
 */
@Data
public class PmsAttrAttrgroupRelation {
    /**
     * id
     */
    private Long id;

    /**
     * 属性id
     */
    private Long attrId;

    /**
     * 属性分组id
     */
    private Long attrGroupId;

    /**
     * 属性组内排序
     */
    private Integer attrSort;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}