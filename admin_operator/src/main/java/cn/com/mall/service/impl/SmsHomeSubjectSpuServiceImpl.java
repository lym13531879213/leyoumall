package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.SmsHomeSubjectSpuMapper;
import cn.com.mall.service.SmsHomeSubjectSpuService;
@Service
public class SmsHomeSubjectSpuServiceImpl implements SmsHomeSubjectSpuService{

    @Resource
    private SmsHomeSubjectSpuMapper smsHomeSubjectSpuMapper;

}
