package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.SmsSkuLadderMapper;
import cn.com.mall.api.service.SmsSkuLadderService;

@Service
public class SmsSkuLadderServiceImpl implements SmsSkuLadderService{

    @Resource
    private SmsSkuLadderMapper smsSkuLadderMapper;

}
