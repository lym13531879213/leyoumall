package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 会员收藏的专题活动
 */
@Data
public class UmsMemberCollectSubject {
    /**
     * id
     */
    private Long id;

    /**
     * subject_id
     */
    private Long subjectId;

    /**
     * subject_name
     */
    private String subjectName;

    /**
     * subject_img
     */
    private String subjectImg;

    /**
     * 活动url
     */
    private String subjectUrll;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}