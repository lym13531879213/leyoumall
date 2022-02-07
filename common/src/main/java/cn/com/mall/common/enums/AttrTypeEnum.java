package cn.com.mall.common.enums;

/**
 * @author liaoyuming
 * @date 2022/2/6 20:17
 * @Description
 */
public enum AttrTypeEnum {

    /**
     * 销售属性
     */
    SALES_ATTRIBUTES(0, "销售属性"),
    /**
     * 规格参数(基本属性)
     */
    SPECIFICATION(1, "规格参数");

    private Integer type;
    private String name;

    private AttrTypeEnum(Integer type, String name) {
        this.type = type;
        this.name = name;
    }

    public Integer getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public static AttrTypeEnum of(Integer type) {
        for (AttrTypeEnum value : values()) {
            if (value.getType().equals(type)) {
                return value;
            }
        }
        return null;
    }
}
