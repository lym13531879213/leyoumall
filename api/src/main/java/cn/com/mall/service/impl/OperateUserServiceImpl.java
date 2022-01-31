package cn.com.mall.service.impl;

import cn.com.mall.mapper.OperateUserMapper;
import cn.com.mall.service.OperateUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OperateUserServiceImpl implements OperateUserService {

    @Resource
    private OperateUserMapper operateUserMapper;


}
