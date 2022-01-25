package cn.com.mall.utils;


import org.apache.commons.lang.StringUtils;

/**
 * 断言工具
 *
 * @author xuhaoming
 * @date 2021/9/1 9:51
 */
public class AssertUtil {

    /**
     * 断言条件为 true， 如果是false则抛出业务异常
     *
     * @param condition 条件
     * @param errorMsg  错误提示信息
     */
    public static void isTrue(boolean condition, String errorMsg) {
        if (!condition) {
            throw new RuntimeException(errorMsg);
        }
    }


    /**
     * 断言条件为 false， 如果是 true 则抛出业务异常
     *
     * @param condition 条件
     * @param errorMsg  错误提示信息
     */
    public static void isFalse(boolean condition, String errorMsg) {
        if (condition) {
            throw new RuntimeException(errorMsg);
        }
    }


    /**
     * 断言对象非空， 如果为null 则抛出业务异常
     *
     * @param obj      对象
     * @param errorMsg 错误提示信息
     */
    public static void isNotNull(Object obj, String errorMsg) {
        if (obj == null) {
            throw new RuntimeException(errorMsg);
        }
    }


    /**
     * 断言字符串非空白串，否则则抛出业务异常
     *
     * @param str      字符串
     * @param errorMsg 错误提示信息
     */
    public static void isNotBlank(String str, String errorMsg) {
        if (StringUtils.isBlank(str)) {
            throw new RuntimeException(errorMsg);
        }
    }

}
