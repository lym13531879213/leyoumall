package cn.com.mall.config.auth.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.github.pagehelper.util.StringUtil;

import java.util.Date;
import java.util.Map;

/**
 *
 */
public class JwtUtil {
    //指定token过期时间(毫秒)-> 1天
    private static final long EXPIRE_TIME = 1 * 24 * 60 * 60 * 1000;

    /**
     * @param map    token中数据
     * @param secret 密码
     * @return token字符串
     */
    public static String getJwtToken(Map<String, String> map, String secret) {
        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
        Algorithm algorithm = Algorithm.HMAC256(secret);
        // 附带userId信息的token
        JWTCreator.Builder builder = JWT.create();
        map.forEach((k, v) -> {
            builder.withClaim(k, v);
        });
        return builder.withExpiresAt(date).sign(algorithm);
    }


    public static DecodedJWT getTokenInfo(String token) {
        if (StringUtil.isEmpty(token)) {
            return null;
        }
        return JWT.decode(token);
    }

    /**
     * @return token中包含的用户名
     */
    public static String getOperatorId(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("operatorId").asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }

    public static boolean vertify(String token, String secret) {
        try {
            JWT.require(Algorithm.HMAC256(secret)).build().verify(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * @param token token字符串
     * @return 判断token是否过期
     */
    public static boolean isExpire(String token) {
        DecodedJWT jwt = JWT.decode(token);
        return jwt.getExpiresAt().getTime() < System.currentTimeMillis();
    }

}
