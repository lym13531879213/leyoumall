package cn.com.mall.entity;

import lombok.Data;

/**
 * 用户与角色对应关系
 */
@Data
public class OperateUserRole {
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;
}