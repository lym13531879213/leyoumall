package cn.com.mall.api.service.impl;

import cn.com.mall.api.service.PmsCategoryBrandRelationService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.PmsCategoryBrandRelationMapper;

@Service
public class PmsCategoryBrandRelationServiceImpl implements PmsCategoryBrandRelationService {

    @Resource
    private PmsCategoryBrandRelationMapper pmsCategoryBrandRelationMapper;

}
