package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.SmsSeckillSessionMapper;
import cn.com.mall.api.service.SmsSeckillSessionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class SmsSeckillSessionServiceImpl implements SmsSeckillSessionService {

    @Resource
    private SmsSeckillSessionMapper smsSeckillSessionMapper;

}
