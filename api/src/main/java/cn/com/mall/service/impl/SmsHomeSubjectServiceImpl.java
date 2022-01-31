package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.SmsHomeSubjectMapper;
import cn.com.mall.service.SmsHomeSubjectService;

@Service
public class SmsHomeSubjectServiceImpl implements SmsHomeSubjectService{

    @Resource
    private SmsHomeSubjectMapper smsHomeSubjectMapper;

}
