package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.OperateUserMapper;
import cn.com.mall.api.service.OperateUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OperateUserServiceImpl implements OperateUserService {

    @Resource
    private OperateUserMapper operateUserMapper;


}
