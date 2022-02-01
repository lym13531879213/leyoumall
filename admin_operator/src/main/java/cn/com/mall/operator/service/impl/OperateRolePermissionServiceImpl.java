package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.OperateRolePermissionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.OperateRolePermissionMapper;

@Service
public class OperateRolePermissionServiceImpl implements OperateRolePermissionService {

    @Resource
    private OperateRolePermissionMapper operateRolePermissionMapper;

}
