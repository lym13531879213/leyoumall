package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.SmsCouponSpuRelationService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.SmsCouponSpuRelationMapper;

@Service
public class SmsCouponSpuRelationServiceImpl implements SmsCouponSpuRelationService {

    @Resource
    private SmsCouponSpuRelationMapper smsCouponSpuRelationMapper;

}
