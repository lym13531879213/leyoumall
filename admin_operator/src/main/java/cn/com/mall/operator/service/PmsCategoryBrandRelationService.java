package cn.com.mall.operator.service;

import cn.com.mall.common.Result;
import cn.com.mall.entity.PmsCategoryBrandRelation;
import cn.com.mall.operator.pojo.vo.pms.CategoryBrandRelationVO;

import java.util.List;

public interface PmsCategoryBrandRelationService{
    List<CategoryBrandRelationVO> getBrandCategoryRelation(Long brandId);

    boolean deleteBrandCategoryRelation(List<Long> ids);

    boolean addBrandCategoryRelation(Long brandId, Long catId);
}
