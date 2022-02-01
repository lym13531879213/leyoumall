package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.OperateUserRoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.OperateUserRoleMapper;

@Service
public class OperateUserRoleServiceImpl implements OperateUserRoleService {

    @Resource
    private OperateUserRoleMapper operateUserRoleMapper;

}

