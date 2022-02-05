package cn.com.mall.operator.mapper;

import cn.com.mall.entity.PmsAttr;
import cn.com.mall.entity.PmsAttrGroup;
import cn.com.mall.operator.pojo.dto.pms.AttrGroupDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsAttrGroupMapper {
    List<PmsAttrGroup> getPage(@Param("groupId") Long groupId, @Param("attrGroupName") String attrGroupName);

    boolean addAttrGroup(AttrGroupDTO dto);

    PmsAttrGroup getAttrGroup(@Param("attrGroupId") Long attrGroupId);

    boolean deleteAttrGroup(@Param("attrGroupId") Long attrGroupId);

    boolean putAttrGroup(AttrGroupDTO dto);
}