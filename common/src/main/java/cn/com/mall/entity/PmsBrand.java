package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 品牌
 */
@Data
public class PmsBrand {
    /**
     * 品牌id
     */
    private Long brandId;

    /**
     * 品牌名
     */
    private String name;

    /**
     * 品牌logo地址
     */
    private String logo;

    /**
     * 介绍
     */
    private String description;

    /**
     * 显示状态[0-不显示；1-显示]
     */
    private Integer showStatus;

    /**
     * 检索首字母
     */
    private String firstLetter;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 删除状态->0-未删除，1-已删除
     */
    private Integer deleted;

}