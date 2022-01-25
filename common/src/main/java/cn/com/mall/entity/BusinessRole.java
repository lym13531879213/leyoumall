package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 角色
 */
@Data
public class BusinessRole {
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建者ID
     */
    private Long createUserId;

    /**
     * 创建时间
     */
    private Date createTime;
}