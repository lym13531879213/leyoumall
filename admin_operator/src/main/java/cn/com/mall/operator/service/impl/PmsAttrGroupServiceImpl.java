package cn.com.mall.operator.service.impl;

import cn.com.mall.entity.PmsAttrGroup;
import cn.com.mall.operator.mapper.PmsAttrGroupMapper;
import cn.com.mall.operator.pojo.dto.pms.AttrGroupDTO;
import cn.com.mall.operator.service.PmsAttrGroupService;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PmsAttrGroupServiceImpl implements PmsAttrGroupService {

    @Resource
    private PmsAttrGroupMapper pmsAttrGroupMapper;

    private static void accept(PmsAttrGroup group) {
        String cateIds = group.getCateIds();
    }

    @Override
    public List<PmsAttrGroup> getPage(Object page, Long catId, Long groupId, String attrGroupName) {
        PageHelper.startPage(page);
        List<PmsAttrGroup> list = pmsAttrGroupMapper.getPage(groupId, attrGroupName);
        if(catId!=null){
            list = list.stream().filter(pmsAttrGroup -> {
                List<Long> list1 = JSONArray.parseArray(pmsAttrGroup.getCateIds(), Long.class);
                return list1.contains(catId);
            }).collect(Collectors.toList());
        }
        return list;
    }

    @Override
    public boolean addAttrGroup(AttrGroupDTO dto) {
        return pmsAttrGroupMapper.addAttrGroup(dto);
    }

    @Override
    public PmsAttrGroup getAttrGroup(Long attrGroupId) {
        return pmsAttrGroupMapper.getAttrGroup(attrGroupId);
    }

    @Override
    public boolean deleteAttrGroup(Long attrGroupId) {
        return pmsAttrGroupMapper.deleteAttrGroup(attrGroupId);
    }

    @Override
    public boolean putAttrGroup(AttrGroupDTO dto) {
        return pmsAttrGroupMapper.putAttrGroup(dto);
    }
}
