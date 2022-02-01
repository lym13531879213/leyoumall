package cn.com.mall.api.service;

import cn.com.mall.api.pojo.dto.ums.ForgetDTO;
import cn.com.mall.api.pojo.dto.ums.LoginDTO;
import cn.com.mall.entity.UmsMember;

public interface UmsMemberService {


    UmsMember getById(Long userId);

    boolean register(String email, String password);

    String login(LoginDTO dto);

    UmsMember getUserByEmail(String email);

    boolean forgetPwd(Long userId, ForgetDTO dto);
}
