package cn.com.mall.operator.mapper;

import cn.com.mall.operator.pojo.po.AttributePO;
import cn.com.mall.operator.pojo.po.ExistPO;
import cn.com.mall.operator.pojo.vo.pms.AttrAndGroupRelationVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsAttrAttrgroupRelationMapper {

    /**
     * 删除属性时，删除与该属性相关的关联
     *
     * @param attrId
     * @return
     */
    @Delete("delete from leyoumall.pms_attr_attrgroup_relation where attr_id = #{attrId}")
    boolean deleteRelation(@Param("attrId") Long attrId);

    List<ExistPO> checkExist(@Param("attrGroupId") Long attrGroupId, @Param("attrIds") List<Long> attrIds);

    boolean relateAttribute(AttributePO attributePO);

    List<AttrAndGroupRelationVO> getRelation(@Param("attrGroupId") Long attrGroupId);

    /**
     * 删除关联列表
     *
     * @param ids
     * @return
     */
    boolean deleteRelations(@Param("ids") List<Long> ids);
}