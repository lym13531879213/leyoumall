package cn.com.mall.entity;

import lombok.Data;

/**
 * 角色与菜单对应关系
 */
@Data
public class BusinessRoleMenu {
    private Long id;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 菜单ID
     */
    private Long menuId;
}