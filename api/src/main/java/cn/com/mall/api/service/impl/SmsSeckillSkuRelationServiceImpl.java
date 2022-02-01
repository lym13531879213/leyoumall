package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.SmsSeckillSkuRelationMapper;
import cn.com.mall.api.service.SmsSeckillSkuRelationService;

@Service
public class SmsSeckillSkuRelationServiceImpl implements SmsSeckillSkuRelationService{

    @Resource
    private SmsSeckillSkuRelationMapper smsSeckillSkuRelationMapper;

}
