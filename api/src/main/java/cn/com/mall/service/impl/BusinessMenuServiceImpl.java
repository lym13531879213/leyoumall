package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.BusinessMenuMapper;
import cn.com.mall.service.BusinessMenuService;

@Service
public class BusinessMenuServiceImpl implements BusinessMenuService{

    @Resource
    private BusinessMenuMapper businessMenuMapper;

}
