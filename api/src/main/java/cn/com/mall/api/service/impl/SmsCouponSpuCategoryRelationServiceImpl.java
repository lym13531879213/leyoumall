package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.SmsCouponSpuCategoryRelationMapper;
import cn.com.mall.api.service.SmsCouponSpuCategoryRelationService;

@Service
public class SmsCouponSpuCategoryRelationServiceImpl implements SmsCouponSpuCategoryRelationService{

    @Resource
    private SmsCouponSpuCategoryRelationMapper smsCouponSpuCategoryRelationMapper;

}
