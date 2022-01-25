package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 角色
 */
@Data
public class OperateRole {
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
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 用户数
     */
    private Integer userCount;

    /**
     * 启用状态，0-禁用，1-正常
     */
    private Integer status;

    /**
     * 是否删除，0-未删除，1-删除
     */
    private Integer deleted;
}