package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.SmsHomeAdvMapper;
import cn.com.mall.api.service.SmsHomeAdvService;

@Service
public class SmsHomeAdvServiceImpl implements SmsHomeAdvService{

    @Resource
    private SmsHomeAdvMapper smsHomeAdvMapper;

}
