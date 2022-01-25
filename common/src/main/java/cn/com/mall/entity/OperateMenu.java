package cn.com.mall.entity;

import lombok.Data;

/**
 * 菜单管理
 */
@Data
public class OperateMenu {
    private Long id;

    /**
     * 父菜单ID，一级菜单为0
     */
    private Long parentId;

    /**
     * 菜单名称
     */
    private String label;

    /**
     * 菜单URL
     */
    private String url;

}