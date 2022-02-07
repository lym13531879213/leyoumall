package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.pojo.vo.pms.AttrAndGroupRelationVO;
import cn.com.mall.operator.service.PmsAttrAttrgroupRelationService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.PmsAttrAttrgroupRelationMapper;

import java.util.List;

@Service
public class PmsAttrAttrgroupRelationServiceImpl implements PmsAttrAttrgroupRelationService {

    @Resource
    private PmsAttrAttrgroupRelationMapper relationMapper;

    @Override
    public boolean relateAttribute(Long attrGroupId, Long attrId,Integer sort) {
        int count = relationMapper.checkExist(attrGroupId,attrId);
        if (count>0) {
            throw new RuntimeException("该关联已经存在");
        }
        return relationMapper.relateAttribute(attrGroupId,attrId,sort);
    }

    @Override
    public List<AttrAndGroupRelationVO> getRelation(Long attrGroupId) {
        return relationMapper.getRelation(attrGroupId);
    }

    @Override
    public boolean deleteRelation(List<Long> ids) {
        return relationMapper.deleteRelations(ids);
    }
}
