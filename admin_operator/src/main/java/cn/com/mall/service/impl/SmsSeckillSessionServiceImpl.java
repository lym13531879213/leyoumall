package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.SmsSeckillSessionMapper;
import cn.com.mall.service.SmsSeckillSessionService;
@Service
public class SmsSeckillSessionServiceImpl implements SmsSeckillSessionService{

    @Resource
    private SmsSeckillSessionMapper smsSeckillSessionMapper;

}
