package cn.com.mall.operator.service.impl;

import cn.com.mall.common.Result;
import cn.com.mall.entity.PmsCategoryBrandRelation;
import cn.com.mall.operator.pojo.vo.pms.CategoryBrandRelationVO;
import cn.com.mall.operator.service.PmsCategoryBrandRelationService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.PmsCategoryBrandRelationMapper;

import java.util.List;

@Service
public class PmsCategoryBrandRelationServiceImpl implements PmsCategoryBrandRelationService {

    @Resource
    private PmsCategoryBrandRelationMapper pmsCategoryBrandRelationMapper;

    @Override
    public List<CategoryBrandRelationVO> getBrandCategoryRelation(Long brandId) {
        return pmsCategoryBrandRelationMapper.getBrandCategoryRelation(brandId);
    }

    @Override
    public boolean deleteBrandCategoryRelation(List<Long> ids) {
        return pmsCategoryBrandRelationMapper.deleteBrandCategoryRelation(ids);
    }

    @Override
    public boolean addBrandCategoryRelation(Long brandId, Long catId) {
        int count = pmsCategoryBrandRelationMapper.checkExist(brandId,catId);
        if(count>0){
            throw new RuntimeException("该关联已经存在");
        }
        return pmsCategoryBrandRelationMapper.addBrandCategoryRelation(brandId,catId);
    }
}
