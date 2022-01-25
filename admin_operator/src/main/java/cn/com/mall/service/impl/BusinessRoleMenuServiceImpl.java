package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.BusinessRoleMenuMapper;
import cn.com.mall.service.BusinessRoleMenuService;
@Service
public class BusinessRoleMenuServiceImpl implements BusinessRoleMenuService{

    @Resource
    private BusinessRoleMenuMapper businessRoleMenuMapper;

}
