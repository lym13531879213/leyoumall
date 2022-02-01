package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.OperateMenuMapper;
import cn.com.mall.api.service.OperateMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OperateMenuServiceImpl implements OperateMenuService {

    @Resource
    private OperateMenuMapper operateMenuMapper;


}

