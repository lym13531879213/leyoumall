package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.BusinessRoleMenuService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.BusinessRoleMenuMapper;

@Service
public class BusinessRoleMenuServiceImpl implements BusinessRoleMenuService {

    @Resource
    private BusinessRoleMenuMapper businessRoleMenuMapper;

}
