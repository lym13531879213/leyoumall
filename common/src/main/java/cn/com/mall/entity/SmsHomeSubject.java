package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 首页专题表
 */
@Data
public class SmsHomeSubject {
    /**
     * id
     */
    private Long id;

    /**
     * 专题名字
     */
    private String name;

    /**
     * 专题标题
     */
    private String title;

    /**
     * 专题副标题
     */
    private String subTitle;

    /**
     * 显示状态
     */
    private Boolean status;

    /**
     * 详情连接
     */
    private String url;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 专题图片地址
     */
    private String img;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}