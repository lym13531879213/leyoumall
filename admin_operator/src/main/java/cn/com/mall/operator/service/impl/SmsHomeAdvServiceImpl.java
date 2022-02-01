package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.SmsHomeAdvService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.SmsHomeAdvMapper;

@Service
public class SmsHomeAdvServiceImpl implements SmsHomeAdvService {

    @Resource
    private SmsHomeAdvMapper smsHomeAdvMapper;

}
