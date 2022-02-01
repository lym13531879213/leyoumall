package cn.com.mall.api.service.impl;

import cn.com.mall.api.service.BusinessUserRoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.BusinessUserRoleMapper;

@Service
public class BusinessUserRoleServiceImpl implements BusinessUserRoleService {

    @Resource
    private BusinessUserRoleMapper businessUserRoleMapper;

}
