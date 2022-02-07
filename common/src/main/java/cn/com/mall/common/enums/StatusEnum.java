package cn.com.mall.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StatusEnum {

    /**
     * 不显示
     */
    STATUS_NO(0, "不显示"),
    /**
     * 显示
     */
    STATUS_YES(1, "显示");

    private Integer status;
    private String name;

    public static String getNameByStatus(Integer status) {
        for (StatusEnum value : values()) {
            if (value.getStatus().equals(status)) {
                return value.getName();
            }
        }
        return null;
    }

}
