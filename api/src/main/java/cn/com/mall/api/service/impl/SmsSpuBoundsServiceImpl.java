package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.SmsSpuBoundsMapper;
import cn.com.mall.api.service.SmsSpuBoundsService;

@Service
public class SmsSpuBoundsServiceImpl implements SmsSpuBoundsService{

    @Resource
    private SmsSpuBoundsMapper smsSpuBoundsMapper;

}
