package cn.com.mall.operator.service.impl;

import cn.com.mall.entity.PmsAttr;
import cn.com.mall.entity.PmsAttrGroup;
import cn.com.mall.operator.mapper.PmsAttrGroupMapper;
import cn.com.mall.operator.pojo.dto.pms.AttrGroupDTO;
import cn.com.mall.operator.service.PmsAttrGroupService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PmsAttrGroupServiceImpl implements PmsAttrGroupService {

    @Resource
    private PmsAttrGroupMapper pmsAttrGroupMapper;

    @Override
    public List<PmsAttr> getPage(Object page, Long catId, Long groupId, String attrGroupName) {
        PageHelper.startPage(page);
        return pmsAttrGroupMapper.getPage(catId, groupId, attrGroupName);
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
