package cn.com.mall.controller;

import cn.com.mall.config.auth.jwt.JwtUtil;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.apache.commons.lang.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

public abstract class BaseController {

    @Resource
    private HttpServletRequest httpServletRequest;

    protected Object getPage() {
        HashMap<String, Integer> map = new HashMap<>();
        String pNo = httpServletRequest.getParameter("pageNo");
        String pSize = httpServletRequest.getParameter("pageSize");
        if (StringUtils.isBlank(pNo)) {
            map.put("pageNum", 1);
        } else {
            map.put("pageNum", Integer.parseInt(pNo));
        }
        if (StringUtils.isBlank(pSize)) {
            map.put("pageSize", 10);
        } else {
            map.put("pageSize", Integer.parseInt(pSize));
        }

        return map;
    }

    protected DecodedJWT getToken(){
        String header = httpServletRequest.getHeader("token");
        return JwtUtil.getTokenInfo(header);
    }
}
