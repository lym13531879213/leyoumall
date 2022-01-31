package cn.com.mall.service.impl;

import cn.com.mall.mapper.OperateMenuMapper;
import cn.com.mall.service.OperateMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OperateMenuServiceImpl implements OperateMenuService {

    @Resource
    private OperateMenuMapper operateMenuMapper;


}

