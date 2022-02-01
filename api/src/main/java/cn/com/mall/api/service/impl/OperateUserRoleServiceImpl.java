package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.OperateUserRoleMapper;
import cn.com.mall.api.service.OperateUserRoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class OperateUserRoleServiceImpl implements OperateUserRoleService {

    @Resource
    private OperateUserRoleMapper operateUserRoleMapper;

}

