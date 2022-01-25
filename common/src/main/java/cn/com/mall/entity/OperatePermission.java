package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
    * 权限表
    */
@Data
public class OperatePermission {
    /**
    * 权限id
    */
    private Long permissionId;

    /**
    * 权限名称
    */
    private String permissionName;

    /**
    * 权限地址
    */
    private String url;

    /**
    * 创建时间
    */
    private Date createTime;
}