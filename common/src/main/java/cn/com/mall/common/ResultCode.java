package cn.com.mall.common;


import lombok.Getter;


@Getter
public enum ResultCode {
    /**
     * 成功
     */
    SUCCESS(200, "成功"),
    FAIL(1000,"失败"),

    /* 用户登陆状态码 */
    USER_NOT_LOGIN_IN(1001, "无token，无权访问，请先登录"),
    TOKEN_EXPIRED(1002,"token过期，请重新登录"),
    FAKE_TOKEN(1003,"token被伪造，无效token"),
    INVALID_USER(1004,"用户不存在或已被禁用"),
    ERROR_PASSWORD(1005,"密码错误");

    private final Integer code;
    private final String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message=message;
    }

    public Integer code() {
        return this.code;
    }

    public String message(){
        return this.message;
    }


}
