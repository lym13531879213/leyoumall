package cn.com.mall.service.impl;

import cn.com.mall.mapper.OperateRoleMenuMapper;
import cn.com.mall.service.OperateRoleMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OperateRoleMenuServiceImpl implements OperateRoleMenuService {

    @Resource
    private OperateRoleMenuMapper roleMenuMapper;

}

