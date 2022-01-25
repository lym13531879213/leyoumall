package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.SmsCouponSpuCategoryRelationMapper;
import cn.com.mall.service.SmsCouponSpuCategoryRelationService;
@Service
public class SmsCouponSpuCategoryRelationServiceImpl implements SmsCouponSpuCategoryRelationService{

    @Resource
    private SmsCouponSpuCategoryRelationMapper smsCouponSpuCategoryRelationMapper;

}
