package cn.com.mall.service.impl;

import cn.com.mall.mapper.PmsBrandMapper;
import cn.com.mall.service.PmsBrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PmsBrandServiceImpl implements PmsBrandService{

    @Resource
    private PmsBrandMapper pmsBrandMapper;


}
