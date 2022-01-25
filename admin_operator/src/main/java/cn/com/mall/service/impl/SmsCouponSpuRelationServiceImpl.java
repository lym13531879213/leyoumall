package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.SmsCouponSpuRelationMapper;
import cn.com.mall.service.SmsCouponSpuRelationService;
@Service
public class SmsCouponSpuRelationServiceImpl implements SmsCouponSpuRelationService{

    @Resource
    private SmsCouponSpuRelationMapper smsCouponSpuRelationMapper;

}
