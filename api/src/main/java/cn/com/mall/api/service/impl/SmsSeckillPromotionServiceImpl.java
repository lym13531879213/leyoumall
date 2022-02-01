package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.SmsSeckillPromotionMapper;
import cn.com.mall.api.service.SmsSeckillPromotionService;

@Service
public class SmsSeckillPromotionServiceImpl implements SmsSeckillPromotionService{

    @Resource
    private SmsSeckillPromotionMapper smsSeckillPromotionMapper;

}
