package cn.com.mall.common.enums;

/**
 * @author liaoyuming
 * @date 2022/2/6 22:43
 * @Description
 */
public enum SwitchEnum {

    /**
     * 是否需要检索[0-不需要，1-需要]
     */
    SEARCH(0),
    /**
     * 启用状态[0 - 禁用，1 - 启用]
     */
    ENABLE(1),
    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
     */
    SHOW_DESC(2);

    private Integer type;

    private SwitchEnum(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return this.type;
    }

    public static SwitchEnum of(Integer type) {
        for (SwitchEnum value : values()) {
            if (value.getType().equals(type)) {
                return value;
            }
        }
        return null;
    }
}
