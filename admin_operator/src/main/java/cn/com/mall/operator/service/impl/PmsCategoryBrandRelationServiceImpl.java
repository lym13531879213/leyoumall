package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.PmsCategoryBrandRelationService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.PmsCategoryBrandRelationMapper;

@Service
public class PmsCategoryBrandRelationServiceImpl implements PmsCategoryBrandRelationService {

    @Resource
    private PmsCategoryBrandRelationMapper pmsCategoryBrandRelationMapper;

}
