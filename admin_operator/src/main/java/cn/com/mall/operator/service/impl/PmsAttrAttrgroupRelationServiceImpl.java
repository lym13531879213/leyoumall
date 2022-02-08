package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.pojo.po.AttributePO;
import cn.com.mall.operator.pojo.po.ExistPO;
import cn.com.mall.operator.pojo.vo.pms.AttrAndGroupRelationVO;
import cn.com.mall.operator.service.PmsAttrAttrgroupRelationService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.PmsAttrAttrgroupRelationMapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PmsAttrAttrgroupRelationServiceImpl implements PmsAttrAttrgroupRelationService {

    @Resource
    private PmsAttrAttrgroupRelationMapper relationMapper;

    @Override
    public boolean relateAttribute(Long attrGroupId, List<Long> attrIds) {
        List<ExistPO> counts = relationMapper.checkExist(attrGroupId,attrIds);
        ArrayList<Long> collect = new ArrayList<>();
        counts.forEach(existPO -> {
            if(existPO.getCount()!=0){
                collect.add(existPO.getId());
            }
        });
        attrIds.removeAll(collect);
        if(attrIds.size()!=0){
            AttributePO attributePO = new AttributePO();
            attributePO.setAttrGroupId(attrGroupId);
            attributePO.setAttrIds(attrIds);
            return relationMapper.relateAttribute(attributePO);
        }
        return true;
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
