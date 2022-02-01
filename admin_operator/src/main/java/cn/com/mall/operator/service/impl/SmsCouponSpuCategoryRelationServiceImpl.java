package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.SmsCouponSpuCategoryRelationService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.SmsCouponSpuCategoryRelationMapper;

@Service
public class SmsCouponSpuCategoryRelationServiceImpl implements SmsCouponSpuCategoryRelationService {

    @Resource
    private SmsCouponSpuCategoryRelationMapper smsCouponSpuCategoryRelationMapper;

}
