package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.BusinessMenuMapper;
import cn.com.mall.api.service.BusinessMenuService;

@Service
public class BusinessMenuServiceImpl implements BusinessMenuService{

    @Resource
    private BusinessMenuMapper businessMenuMapper;

}
