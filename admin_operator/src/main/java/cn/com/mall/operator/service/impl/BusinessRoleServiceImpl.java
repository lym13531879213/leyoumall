package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.BusinessRoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.BusinessRoleMapper;

@Service
public class BusinessRoleServiceImpl implements BusinessRoleService {

    @Resource
    private BusinessRoleMapper businessRoleMapper;

}
