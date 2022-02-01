package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.SmsHomeSubjectService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.SmsHomeSubjectMapper;

@Service
public class SmsHomeSubjectServiceImpl implements SmsHomeSubjectService {

    @Resource
    private SmsHomeSubjectMapper smsHomeSubjectMapper;

}
