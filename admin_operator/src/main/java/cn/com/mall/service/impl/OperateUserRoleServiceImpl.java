package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.OperateUserRoleMapper;
import cn.com.mall.service.OperateUserRoleService;

@Service
public class OperateUserRoleServiceImpl implements OperateUserRoleService {

    @Resource
    private OperateUserRoleMapper operateUserRoleMapper;

}

