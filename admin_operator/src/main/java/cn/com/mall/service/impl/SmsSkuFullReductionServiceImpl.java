package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.SmsSkuFullReductionMapper;
import cn.com.mall.service.SmsSkuFullReductionService;
@Service
public class SmsSkuFullReductionServiceImpl implements SmsSkuFullReductionService{

    @Resource
    private SmsSkuFullReductionMapper smsSkuFullReductionMapper;

}
