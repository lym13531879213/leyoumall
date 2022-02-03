package cn.com.mall.entity;

import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * 属性分组
 */
@Data
public class PmsAttrGroup {
    /**
     * 分组id
     */
    private Long attrGroupId;

    /**
     * 组名
     */
    private String attrGroupName;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 描述
     */
    private String descript;

    /**
     * 组图标
     */
    private String icon;

    /**
     * 所属分类id
     */
    private Long catelogId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 所属分类列表
     */
    List<Long> cateIds;
}