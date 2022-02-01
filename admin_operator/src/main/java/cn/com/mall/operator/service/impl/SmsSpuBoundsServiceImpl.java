package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.SmsSpuBoundsService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.SmsSpuBoundsMapper;

@Service
public class SmsSpuBoundsServiceImpl implements SmsSpuBoundsService {

    @Resource
    private SmsSpuBoundsMapper smsSpuBoundsMapper;

}
