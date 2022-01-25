package cn.com.mall.entity;

import java.util.Date;
import lombok.Data;

/**
 * spu信息介绍
 */
@Data
public class PmsSpuInfoDesc {
    /**
     * 商品id
     */
    private Long spuId;

    /**
     * 商品介绍
     */
    private String decript;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}