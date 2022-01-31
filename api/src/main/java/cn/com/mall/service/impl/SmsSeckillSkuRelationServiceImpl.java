package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.SmsSeckillSkuRelationMapper;
import cn.com.mall.service.SmsSeckillSkuRelationService;

@Service
public class SmsSeckillSkuRelationServiceImpl implements SmsSeckillSkuRelationService{

    @Resource
    private SmsSeckillSkuRelationMapper smsSeckillSkuRelationMapper;

}
