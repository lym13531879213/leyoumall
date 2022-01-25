package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * 商品评价回复关系
 */
@Data
public class PmsCommentReplay {
    /**
     * id
     */
    private Long id;

    /**
     * 评论id
     */
    private Long commentId;

    /**
     * 回复id
     */
    private Long replyId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}