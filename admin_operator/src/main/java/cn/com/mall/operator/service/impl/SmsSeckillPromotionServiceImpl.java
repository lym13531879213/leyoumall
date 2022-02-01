package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.SmsSeckillPromotionService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.SmsSeckillPromotionMapper;

@Service
public class SmsSeckillPromotionServiceImpl implements SmsSeckillPromotionService {

    @Resource
    private SmsSeckillPromotionMapper smsSeckillPromotionMapper;

}
