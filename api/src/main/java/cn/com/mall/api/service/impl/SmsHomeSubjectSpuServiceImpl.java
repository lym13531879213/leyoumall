package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.SmsHomeSubjectSpuMapper;
import cn.com.mall.api.service.SmsHomeSubjectSpuService;

@Service
public class SmsHomeSubjectSpuServiceImpl implements SmsHomeSubjectSpuService{

    @Resource
    private SmsHomeSubjectSpuMapper smsHomeSubjectSpuMapper;

}
