package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.OperatePermissionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.OperatePermissionMapper;

@Service
public class OperatePermissionServiceImpl implements OperatePermissionService {

    @Resource
    private OperatePermissionMapper operatePermissionMapper;

}
