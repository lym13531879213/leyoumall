package cn.com.mall.api.config.auth.jwt;

import org.apache.shiro.authc.AuthenticationToken;

/**
 *
 * @author liaoyuming
 * @date 2021/10/20 22:59
 */
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
