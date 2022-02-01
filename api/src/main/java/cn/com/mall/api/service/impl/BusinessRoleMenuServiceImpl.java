package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.BusinessRoleMenuMapper;
import cn.com.mall.api.service.BusinessRoleMenuService;

@Service
public class BusinessRoleMenuServiceImpl implements BusinessRoleMenuService{

    @Resource
    private BusinessRoleMenuMapper businessRoleMenuMapper;

}
