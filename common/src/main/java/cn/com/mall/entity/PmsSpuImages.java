package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * spu图片
 */
@Data
public class PmsSpuImages {
    /**
     * id
     */
    private Long id;

    /**
     * spu_id
     */
    private Long spuId;

    /**
     * 图片名
     */
    private String imgName;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 顺序
     */
    private Integer imgSort;

    /**
     * 是否默认图
     */
    private Byte defaultImg;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}