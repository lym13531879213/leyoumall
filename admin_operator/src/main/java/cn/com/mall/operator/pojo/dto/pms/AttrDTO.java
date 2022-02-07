package cn.com.mall.operator.pojo.dto.pms;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class AttrDTO {

    /**
     * 属性id
     */
    private Long attrId;

    /**
     * 属性名
     */
    @NotBlank(message = "属性名不能为空")
    private String attrName;

    /**
     * 是否需要检索[0-不需要，1-需要]
     */
    @NotNull(message = "检索状态不能为空")
    private Integer searchType;

    /**
     * 属性图标
     */
    private String icon;

    /**
     * 属性值类型[0 - 单值，1-多值]
     */
    @NotNull(message = "属性值类型不能为空")
    private Integer valueType;

    /**
     * 可选值列表[用逗号分隔]
     */
    private String valueSelect;

    /**
     * 属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]
     */
    @NotNull(message = "属性类型不能为空")
    private Integer attrType;

    /**
     * 启用状态[0 - 禁用，1 - 启用]
     */
    @NotNull(message = "启用状态不能为空")
    private Long enable;

    /**
     * 所属分类
     */
    private Long catId;

    private String cateIds;

    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
     */
    @NotNull(message = "快速展示状态不能为空")
    private Integer showDesc;

}
