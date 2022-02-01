package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.SmsSeckillSessionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.SmsSeckillSessionMapper;

@Service
public class SmsSeckillSessionServiceImpl implements SmsSeckillSessionService {

    @Resource
    private SmsSeckillSessionMapper smsSeckillSessionMapper;

}
