package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.SmsSkuLadderService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.SmsSkuLadderMapper;

@Service
public class SmsSkuLadderServiceImpl implements SmsSkuLadderService {

    @Resource
    private SmsSkuLadderMapper smsSkuLadderMapper;

}
