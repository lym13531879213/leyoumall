package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.SmsCouponMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import cn.com.mall.api.service.SmsCouponService;

@Service
public class SmsCouponServiceImpl implements SmsCouponService{

    @Resource
    private SmsCouponMapper smsCouponMapper;

}
