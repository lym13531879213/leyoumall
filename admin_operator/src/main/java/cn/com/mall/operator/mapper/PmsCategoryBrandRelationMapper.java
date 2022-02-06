package cn.com.mall.operator.mapper;

import cn.com.mall.entity.PmsCategoryBrandRelation;
import cn.com.mall.operator.pojo.vo.pms.CategoryBrandRelationVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PmsCategoryBrandRelationMapper {
    List<CategoryBrandRelationVO> getBrandCategoryRelation(@Param("brandId") Long brandId);

    boolean deleteBrandCategoryRelation(@Param("ids") List<Long> ids);

    boolean addBrandCategoryRelation(@Param("brandId") Long brandId, @Param("catId") Long catId);

    @Select("select count(*) from leyoumall.pms_category_brand_relation where brand_id = #{brandId} and catelog_id = #{catId}")
    int checkExist(@Param("brandId") Long brandId,@Param("catId") Long catId);
}