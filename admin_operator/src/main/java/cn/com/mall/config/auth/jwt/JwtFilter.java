package cn.com.mall.config.auth.jwt;


import cn.com.mall.common.Result;
import cn.com.mall.common.ResultCode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.ExpiredCredentialsException;
import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.stereotype.Component;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtFilter extends BasicHttpAuthenticationFilter {
    @Override
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
        //在请求头中获取token
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String token = httpServletRequest.getHeader("token");
        //token不存在
        if (token == null || "".equals(token)) {
            out(response,Result.failure(ResultCode.USER_NOT_LOGIN_IN));
            return false;
        }

        //token存在，进行验证
        JwtToken jwtToken = new JwtToken(token);
        try {
            //通过subject，提交给myRealm进行登录验证
            SecurityUtils.getSubject().login(jwtToken);
            return true;
        } catch (ExpiredCredentialsException e) {
            Result result = Result.failure(ResultCode.TOKEN_EXPIRED);
            out(response, result);
            return false;
        } catch (ShiroException e) {
            // 其他情况抛出的异常统一处理，由于先前是登录进去的了，所以都可以看成是token被伪造造成的
            Result result = Result.failure(ResultCode.FAKE_TOKEN);
            out(response, result);
            return false;
        }
    }

    private void out(ServletResponse response, Result res) throws IOException {
        HttpServletResponse httpServletResponse = WebUtils.toHttp(response);
        ObjectMapper mapper = new ObjectMapper();
        String jsonRes = mapper.writeValueAsString(res);
        httpServletResponse.setCharacterEncoding("UTF-8");
        httpServletResponse.setContentType("application/json; charset=utf-8");
        httpServletResponse.getOutputStream().write(jsonRes.getBytes());
    }

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        try {
            //token验证
            return executeLogin(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setStatus(200);
        httpServletResponse.setContentType("application/json;charset=utf-8");

        // 拒绝访问
        return false;

    }

}
