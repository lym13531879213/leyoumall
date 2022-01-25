package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 运营商用户
 */
@Data
public class OperateUser {
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 状态  0：禁用   1：正常
     */
    private Byte status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 头像
     */
    private String headImg;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除，0-未删除，1-已删除
     */
    private Integer deleted;
}