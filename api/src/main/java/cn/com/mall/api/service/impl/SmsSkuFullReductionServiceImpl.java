package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.SmsSkuFullReductionMapper;
import cn.com.mall.api.service.SmsSkuFullReductionService;

@Service
public class SmsSkuFullReductionServiceImpl implements SmsSkuFullReductionService{

    @Resource
    private SmsSkuFullReductionMapper smsSkuFullReductionMapper;

}
