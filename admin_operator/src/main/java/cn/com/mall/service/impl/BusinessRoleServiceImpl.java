package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.BusinessRoleMapper;
import cn.com.mall.service.BusinessRoleService;
@Service
public class BusinessRoleServiceImpl implements BusinessRoleService{

    @Resource
    private BusinessRoleMapper businessRoleMapper;

}
