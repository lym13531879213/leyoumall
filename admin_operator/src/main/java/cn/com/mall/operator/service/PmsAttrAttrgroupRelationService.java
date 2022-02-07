package cn.com.mall.operator.service;

import cn.com.mall.operator.pojo.vo.pms.AttrAndGroupRelationVO;

import java.util.List;

public interface PmsAttrAttrgroupRelationService{


    boolean relateAttribute(Long attrGroupId, Long attrId, Integer sort);

    List<AttrAndGroupRelationVO> getRelation(Long attrGroupId);

    boolean deleteRelation(List<Long> ids);
}
