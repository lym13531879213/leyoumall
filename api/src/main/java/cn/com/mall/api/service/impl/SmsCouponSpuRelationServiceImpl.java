package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.SmsCouponSpuRelationMapper;
import cn.com.mall.api.service.SmsCouponSpuRelationService;

@Service
public class SmsCouponSpuRelationServiceImpl implements SmsCouponSpuRelationService{

    @Resource
    private SmsCouponSpuRelationMapper smsCouponSpuRelationMapper;

}
