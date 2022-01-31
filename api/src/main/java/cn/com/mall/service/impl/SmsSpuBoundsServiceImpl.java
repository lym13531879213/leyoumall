package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.SmsSpuBoundsMapper;
import cn.com.mall.service.SmsSpuBoundsService;

@Service
public class SmsSpuBoundsServiceImpl implements SmsSpuBoundsService{

    @Resource
    private SmsSpuBoundsMapper smsSpuBoundsMapper;

}
