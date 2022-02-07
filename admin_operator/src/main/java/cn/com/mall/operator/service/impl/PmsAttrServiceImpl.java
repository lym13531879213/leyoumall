package cn.com.mall.operator.service.impl;

import cn.com.mall.common.enums.SwitchEnum;
import cn.com.mall.entity.PmsAttr;
import cn.com.mall.operator.mapper.PmsAttrAttrgroupRelationMapper;
import cn.com.mall.operator.mapper.PmsAttrMapper;
import cn.com.mall.operator.pojo.dto.pms.AttrDTO;
import cn.com.mall.operator.service.PmsAttrService;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PmsAttrServiceImpl implements PmsAttrService {

    @Resource
    private PmsAttrMapper pmsAttrMapper;

    @Autowired
    private PmsAttrAttrgroupRelationMapper relationMapper;

    @Override
    public List<PmsAttr> getAttrPage(Object page, Long attrId, String attrName, Long catId, Integer searchType, Integer attrType, Integer enable) {
        PageHelper.startPage(page);
        List<PmsAttr> list = pmsAttrMapper.getAttrPage(attrId, attrName, catId, searchType, attrType, enable);
        if (catId != null) {
            list = list.stream().filter(attr -> {
                List<Long> list1 = JSONArray.parseArray(attr.getCateIds(), Long.class);
                return list1.contains(catId);
            }).collect(Collectors.toList());
        }
        return list;
    }

    @Override
    public PmsAttr getAttr(Long attrId) {
        return pmsAttrMapper.getById(attrId);
    }

    @Override
    public boolean addAttr(AttrDTO dto) {
        return pmsAttrMapper.addAttr(dto);
    }

    @Override
    public boolean deleteAttr(Long attrId) {
        relationMapper.deleteRelation(attrId);
        return pmsAttrMapper.deleteAttr(attrId);
    }

    @Override
    public boolean putAttr(Long attrId, AttrDTO dto) {
        return pmsAttrMapper.putAttr(attrId, dto.getAttrName(), dto.getValueType(),
                dto.getValueSelect(), dto.getAttrType(), dto.getCatId(),dto.getCateIds());
    }

    @Override
    public boolean switchStatus(Long attrId, Integer status, Integer type) {
        if (SwitchEnum.SEARCH.getType().equals(type)) {
            return pmsAttrMapper.switchSearch(attrId, status);
        } else if (SwitchEnum.ENABLE.getType().equals(type)) {
            return pmsAttrMapper.switchEnable(attrId, status);
        } else {
            return pmsAttrMapper.switchShowDesc(attrId, status);
        }
    }
}
