package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.OperatePermissionMapper;
import cn.com.mall.api.service.OperatePermissionService;

@Service
public class OperatePermissionServiceImpl implements OperatePermissionService{

    @Resource
    private OperatePermissionMapper operatePermissionMapper;

}
