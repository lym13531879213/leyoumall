package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.SmsHomeAdvMapper;
import cn.com.mall.service.SmsHomeAdvService;
@Service
public class SmsHomeAdvServiceImpl implements SmsHomeAdvService{

    @Resource
    private SmsHomeAdvMapper smsHomeAdvMapper;

}
