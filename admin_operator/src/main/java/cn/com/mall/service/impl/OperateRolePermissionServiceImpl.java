package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.OperateRolePermissionMapper;
import cn.com.mall.service.OperateRolePermissionService;
@Service
public class OperateRolePermissionServiceImpl implements OperateRolePermissionService{

    @Resource
    private OperateRolePermissionMapper operateRolePermissionMapper;

}
