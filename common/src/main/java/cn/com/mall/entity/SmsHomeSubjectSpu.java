package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 专题商品
 */
@Data
public class SmsHomeSubjectSpu {
    /**
     * id
     */
    private Long id;

    /**
     * 专题名字
     */
    private String name;

    /**
     * 专题id
     */
    private Long subjectId;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}