package cn.com.mall.operator.mapper;

import cn.com.mall.operator.pojo.vo.pms.AttrAndGroupRelationVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PmsAttrAttrgroupRelationMapper {

    /**
     * 删除属性时，删除与该属性相关的关联
     * @param attrId
     * @return
     */
    @Delete("delete from leyoumall.pms_attr_attrgroup_relation where attr_id = #{attrId}")
    boolean deleteRelation(@Param("attrId") Long attrId);

    @Select("select count(*) from leyoumall.pms_attr_attrgroup_relation where attr_id=#{attrId} and attr_group_id = #{attrGroupId}")
    int checkExist(@Param("attrGroupId") Long attrGroupId,@Param("attrId") Long attrId);

    @Insert("insert into leyoumall.pms_attr_attrgroup_relation(attr_id, attr_group_id, attr_sort) VALUES(#{attrId},#{attrGroupId},#{sort})")
    boolean relateAttribute(@Param("attrGroupId") Long attrGroupId,@Param("attrId") Long attrId ,@Param("sort") Integer sort);

    List<AttrAndGroupRelationVO> getRelation(@Param("attrGroupId") Long attrGroupId);

    /**
     * 删除关联列表
     * @param ids
     * @return
     */
    boolean deleteRelations(@Param("ids") List<Long> ids);
}