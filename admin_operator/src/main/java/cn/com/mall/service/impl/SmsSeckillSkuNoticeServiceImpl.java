package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.SmsSeckillSkuNoticeMapper;
import cn.com.mall.service.SmsSeckillSkuNoticeService;
@Service
public class SmsSeckillSkuNoticeServiceImpl implements SmsSeckillSkuNoticeService{

    @Resource
    private SmsSeckillSkuNoticeMapper smsSeckillSkuNoticeMapper;

}
