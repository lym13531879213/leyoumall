package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.OperateRoleMenuMapper;
import cn.com.mall.api.service.OperateRoleMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OperateRoleMenuServiceImpl implements OperateRoleMenuService {

    @Resource
    private OperateRoleMenuMapper roleMenuMapper;

}

