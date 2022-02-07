package cn.com.mall.operator.service;

import cn.com.mall.entity.PmsAttr;
import cn.com.mall.operator.pojo.dto.pms.AttrDTO;

import java.util.List;

public interface PmsAttrService{

    List<PmsAttr> getAttrPage(Object page, Long attrId, String attrName,Long catId, Integer searchType, Integer attrType, Integer enable);

    PmsAttr getAttr(Long attrId);

    boolean addAttr(AttrDTO dto);

    boolean deleteAttr(Long attrId);

    boolean putAttr(Long attrId, AttrDTO dto);

    boolean switchStatus(Long attrId, Integer status, Integer type);
}
