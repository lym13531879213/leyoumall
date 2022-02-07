package cn.com.mall.operator.service;

import cn.com.mall.entity.PmsAttr;
import cn.com.mall.entity.PmsAttrGroup;
import cn.com.mall.operator.pojo.dto.pms.AttrGroupDTO;
import cn.com.mall.operator.pojo.vo.pms.AttrAndGroupRelationVO;

import java.util.List;

public interface PmsAttrGroupService {

    List<PmsAttrGroup> getPage(Object page, Long catId, Long groupId, String attrGroupName);

    boolean addAttrGroup(AttrGroupDTO dto);

    PmsAttrGroup getAttrGroup(Long attrGroupId);

    boolean deleteAttrGroup(Long attrGroupId);

    boolean putAttrGroup(AttrGroupDTO dto);
}
