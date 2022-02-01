package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.SmsCouponService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.SmsCouponMapper;

@Service
public class SmsCouponServiceImpl implements SmsCouponService {

    @Resource
    private SmsCouponMapper smsCouponMapper;

}
