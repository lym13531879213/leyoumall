package cn.com.mall.mapper;

import cn.com.mall.entity.PmsCategory;
import cn.com.mall.pojo.vo.pms.ModifyCategoryVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PmsCategoryMapper {
    List<PmsCategory> getList(@Param("catId") Long catId, @Param("name") String name, @Param("parentCid") Long parentCid,
                              @Param("catLevel") Integer catLevel, @Param("showStatus") Integer showStatus);

    @Update("update leyoumall.pms_category set show_status=#{showStatus},update_time = now() where cat_id=#{catId} ")
    boolean switchStatus(@Param("catId") Long catId, @Param("showStatus") Integer showStatus);

    @Select("select count(*) from leyoumall.pms_category where cat_id = #{catId} and deleted = 0")
    boolean isExist(@Param("catId") Long catId);

    PmsCategory getCategory(@Param("catId") Long catId);

    boolean deleteCategory(@Param("deleteIdList") List<Long> deleteIdList);

    @Select("select cat_id,`name`,product_unit,sort from leyoumall.pms_category where cat_id=#{catId}")
    ModifyCategoryVO getModifyCategoryVO(@Param("catId") Long catId);

    @Update("update leyoumall.pms_category set name = #{name}, product_unit = #{productUnit} , sort = #{sort} , update_time = now() where cat_id = #{catId}")
    boolean modifyCategory(@Param("catId") Long catId, @Param("name") String name, @Param("productUnit") String productUnit, @Param("sort") Integer sort);

    boolean addCategory(PmsCategory pmsCategory);

    @Select("select cat_id from leyoumall.pms_category where parent_cid = #{catId}")
    List<Long> getChildren(@Param("catId") Long catId);

    boolean transferCategory(@Param("updateIdList") List<Long> updateIdList, @Param("parentCatLvel") Integer parentCatLevel,
                             @Param("parentCid") Long parentCid);
}