package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.OperateRoleMapper;
import cn.com.mall.api.service.OperateRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OperateRoleServiceImpl implements OperateRoleService {

    @Resource
    private OperateRoleMapper operateRoleMapper;

}

