package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.SmsSeckillSkuNoticeMapper;
import cn.com.mall.api.service.SmsSeckillSkuNoticeService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class SmsSeckillSkuNoticeServiceImpl implements SmsSeckillSkuNoticeService {

    @Resource
    private SmsSeckillSkuNoticeMapper smsSeckillSkuNoticeMapper;

}
