package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.BusinessRoleMapper;
import cn.com.mall.api.service.BusinessRoleService;

@Service
public class BusinessRoleServiceImpl implements BusinessRoleService{

    @Resource
    private BusinessRoleMapper businessRoleMapper;

}
