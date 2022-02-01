package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.SmsSeckillSkuRelationService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.SmsSeckillSkuRelationMapper;

@Service
public class SmsSeckillSkuRelationServiceImpl implements SmsSeckillSkuRelationService {

    @Resource
    private SmsSeckillSkuRelationMapper smsSeckillSkuRelationMapper;

}
