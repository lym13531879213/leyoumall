package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.OperateRolePermissionMapper;
import cn.com.mall.api.service.OperateRolePermissionService;

@Service
public class OperateRolePermissionServiceImpl implements OperateRolePermissionService{

    @Resource
    private OperateRolePermissionMapper operateRolePermissionMapper;

}
