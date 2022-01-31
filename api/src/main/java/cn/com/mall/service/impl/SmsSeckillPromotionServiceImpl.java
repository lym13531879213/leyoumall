package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.SmsSeckillPromotionMapper;
import cn.com.mall.service.SmsSeckillPromotionService;

@Service
public class SmsSeckillPromotionServiceImpl implements SmsSeckillPromotionService{

    @Resource
    private SmsSeckillPromotionMapper smsSeckillPromotionMapper;

}
