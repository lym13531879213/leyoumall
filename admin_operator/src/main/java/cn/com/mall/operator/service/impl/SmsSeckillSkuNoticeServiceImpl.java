package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.SmsSeckillSkuNoticeService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.SmsSeckillSkuNoticeMapper;

@Service
public class SmsSeckillSkuNoticeServiceImpl implements SmsSeckillSkuNoticeService {

    @Resource
    private SmsSeckillSkuNoticeMapper smsSeckillSkuNoticeMapper;

}
