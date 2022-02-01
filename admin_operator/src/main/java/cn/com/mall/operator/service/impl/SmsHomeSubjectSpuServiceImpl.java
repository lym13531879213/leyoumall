package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.SmsHomeSubjectSpuService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.SmsHomeSubjectSpuMapper;

@Service
public class SmsHomeSubjectSpuServiceImpl implements SmsHomeSubjectSpuService {

    @Resource
    private SmsHomeSubjectSpuMapper smsHomeSubjectSpuMapper;

}
