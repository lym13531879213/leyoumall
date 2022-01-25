package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.PmsCategoryBrandRelationMapper;
import cn.com.mall.service.PmsCategoryBrandRelationService;
@Service
public class PmsCategoryBrandRelationServiceImpl implements PmsCategoryBrandRelationService{

    @Resource
    private PmsCategoryBrandRelationMapper pmsCategoryBrandRelationMapper;

}
