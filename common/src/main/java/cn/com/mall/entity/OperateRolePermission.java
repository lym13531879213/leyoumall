package cn.com.mall.entity;

import lombok.Data;

/**
    * 角色-权限表
    */
@Data
public class OperateRolePermission {
    /**
    * 角色-权限关联id
    */
    private Long id;

    /**
    * 角色id
    */
    private Long roleId;

    /**
    * 权限id
    */
    private Long permissionId;
}