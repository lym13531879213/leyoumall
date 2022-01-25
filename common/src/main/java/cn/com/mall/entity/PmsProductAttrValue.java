package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * spu属性值
 */
@Data
public class PmsProductAttrValue {
    /**
     * id
     */
    private Long id;

    /**
     * 商品id
     */
    private Long spuId;

    /**
     * 属性id
     */
    private Long attrId;

    /**
     * 属性名
     */
    private String attrName;

    /**
     * 属性值
     */
    private String attrValue;

    /**
     * 顺序
     */
    private Integer attrSort;

    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】
     */
    private Byte quickShow;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}