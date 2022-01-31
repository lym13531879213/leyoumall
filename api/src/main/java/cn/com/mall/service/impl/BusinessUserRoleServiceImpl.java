package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.BusinessUserRoleMapper;
import cn.com.mall.service.BusinessUserRoleService;

@Service
public class BusinessUserRoleServiceImpl implements BusinessUserRoleService{

    @Resource
    private BusinessUserRoleMapper businessUserRoleMapper;

}
