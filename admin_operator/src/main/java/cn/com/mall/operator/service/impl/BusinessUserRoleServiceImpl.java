package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.BusinessUserRoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.BusinessUserRoleMapper;

@Service
public class BusinessUserRoleServiceImpl implements BusinessUserRoleService {

    @Resource
    private BusinessUserRoleMapper businessUserRoleMapper;

}
