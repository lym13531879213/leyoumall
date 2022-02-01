package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.SmsSkuFullReductionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.SmsSkuFullReductionMapper;

@Service
public class SmsSkuFullReductionServiceImpl implements SmsSkuFullReductionService {

    @Resource
    private SmsSkuFullReductionMapper smsSkuFullReductionMapper;

}
