package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.SmsHomeSubjectMapper;
import cn.com.mall.api.service.SmsHomeSubjectService;

@Service
public class SmsHomeSubjectServiceImpl implements SmsHomeSubjectService{

    @Resource
    private SmsHomeSubjectMapper smsHomeSubjectMapper;

}
