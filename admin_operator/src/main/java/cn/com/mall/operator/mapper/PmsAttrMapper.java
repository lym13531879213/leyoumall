package cn.com.mall.operator.mapper;

import cn.com.mall.entity.PmsAttr;
import cn.com.mall.operator.pojo.dto.pms.AttrDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PmsAttrMapper {
    List<PmsAttr> getAttrPage(@Param("attrId") Long attrId, @Param("attrName") String attrName, @Param("catId") Long catId,
                              @Param("searchType") Integer searchType, @Param("attrType") Integer attrType, @Param("enable") Integer enable);

    PmsAttr getById(@Param("attrId") Long attrId);

    boolean addAttr(AttrDTO dto);

    @Delete("delete from leyoumall.pms_attr where attr_id = #{attrId}")
    boolean deleteAttr(@Param("attrId") Long attrId);

    boolean putAttr(@Param("attrId") Long attrId, @Param("attrName") String attrName,
                    @Param("valueType") Integer valueType, @Param("valueSelect") String valueSelect,
                    @Param("attrType") Integer attrType, @Param("catId") Long catId,@Param("cateIds") String cateIds);

    @Update("update leyoumall.pms_attr set search_type = #{status},update_time = now() where attr_id = #{attrId}")
    boolean switchSearch(@Param("attrId") Long attrId, @Param("status") Integer status);

    @Update("update leyoumall.pms_attr set `enable` = #{status},update_time = now() where attr_id = #{attrId}")
    boolean switchEnable(@Param("attrId") Long attrId, @Param("status") Integer status);

    @Update("update leyoumall.pms_attr set show_desc = #{status},update_time = now() where attr_id = #{attrId}")
    boolean switchShowDesc(@Param("attrId") Long attrId, @Param("status") Integer status);
}