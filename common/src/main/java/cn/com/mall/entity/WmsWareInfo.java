package cn.com.mall.entity;

import lombok.Data;

/**
 * 仓库信息
 */
@Data
public class WmsWareInfo {
    /**
     * id
     */
    private Long id;

    /**
     * 仓库名
     */
    private String name;

    /**
     * 仓库地址
     */
    private String address;

    /**
     * 区域编码
     */
    private String areacode;
}