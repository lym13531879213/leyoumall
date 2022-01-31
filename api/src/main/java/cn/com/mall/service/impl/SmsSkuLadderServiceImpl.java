package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.SmsSkuLadderMapper;
import cn.com.mall.service.SmsSkuLadderService;

@Service
public class SmsSkuLadderServiceImpl implements SmsSkuLadderService{

    @Resource
    private SmsSkuLadderMapper smsSkuLadderMapper;

}
