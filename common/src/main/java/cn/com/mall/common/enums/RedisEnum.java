package cn.com.mall.common.enums;

/**
 * @author liaoyuming
 * @date 2022/2/1 12:54
 * @Description redis key管理
 */

public enum RedisEnum {
    /**
     * 登录key
     */
    KEY_LOGIN("login", 0),
    /**
     * 注册key
     */
    KEY_REGISTER("register", 1),
    /**
     * 忘记密码key
     */
    KEY_FORGET("forget",2);
    private String keyName;
    private Integer type;

    private RedisEnum(String keyName, Integer type) {
        this.keyName = keyName;
        this.type = type;
    }

    public static RedisEnum of(Integer type) {
        for (RedisEnum redisEnum : RedisEnum.values()) {
            if (redisEnum.type.equals(type)) {
                return redisEnum;
            }
        }
        return null;
    }

    public String getKeyName() {
        return this.keyName;
    }

    public Integer getType() {
        return this.type;
    }
}
