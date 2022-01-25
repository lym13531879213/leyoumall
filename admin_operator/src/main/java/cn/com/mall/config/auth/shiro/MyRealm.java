package cn.com.mall.config.auth.shiro;


import cn.com.mall.config.auth.jwt.JwtToken;
import cn.com.mall.config.auth.jwt.JwtUtil;
import cn.com.mall.entity.OperateUser;
import cn.com.mall.service.OperateUserService;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Authorizer;
import org.apache.shiro.authz.ModularRealmAuthorizer;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@Slf4j
public class MyRealm extends AuthorizingRealm {

    @Autowired
    OperateUserService operateUserService;

    @Bean
    public Authorizer authorizer() {
        return new ModularRealmAuthorizer();
    }

    /**
     * 限定这个realm只能处理JwtToken（不加的话会报错）
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    /**
     * 认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String token = (String) authenticationToken.getCredentials();
        DecodedJWT jwt = null;
        try {
            jwt = JwtUtil.getTokenInfo(token);
        } catch (Exception e) {
            log.warn("非法token:" + e.getMessage());
            throw new IncorrectCredentialsException();
        }
        Long operatorId = Long.valueOf(jwt.getClaim("operatorId").asString());

        if (operatorId == null) {
            throw new UnknownAccountException();
        }
        OperateUser operator = operateUserService.getById(operatorId);

        if (operator == null) {
            throw new UnknownAccountException();
        }
        if(operator.getStatus()==0){
            throw new UnknownAccountException();
        }
        if (!JwtUtil.vertify(token, operator.getPassword())) {
            throw new IncorrectCredentialsException();
        }
        if (JwtUtil.isExpire(token)) {
            throw new ExpiredCredentialsException();
        }
        return new SimpleAuthenticationInfo(operator, token, getName());
    }
}
