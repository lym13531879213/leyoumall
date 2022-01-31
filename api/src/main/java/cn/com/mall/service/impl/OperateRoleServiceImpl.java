package cn.com.mall.service.impl;

import cn.com.mall.mapper.OperateRoleMapper;
import cn.com.mall.service.OperateRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OperateRoleServiceImpl implements OperateRoleService {

    @Resource
    private OperateRoleMapper operateRoleMapper;

}

