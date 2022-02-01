package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.BusinessMenuService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.BusinessMenuMapper;

@Service
public class BusinessMenuServiceImpl implements BusinessMenuService {

    @Resource
    private BusinessMenuMapper businessMenuMapper;

}
