package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.PmsBrandMapper;
import cn.com.mall.api.service.PmsBrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PmsBrandServiceImpl implements PmsBrandService {

    @Resource
    private PmsBrandMapper pmsBrandMapper;


}
