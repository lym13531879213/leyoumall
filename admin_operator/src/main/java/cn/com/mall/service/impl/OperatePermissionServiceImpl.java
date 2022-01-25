package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.OperatePermissionMapper;
import cn.com.mall.service.OperatePermissionService;
@Service
public class OperatePermissionServiceImpl implements OperatePermissionService{

    @Resource
    private OperatePermissionMapper operatePermissionMapper;

}
