package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.PmsAttrAttrgroupRelationMapper;
import cn.com.mall.service.PmsAttrAttrgroupRelationService;
@Service
public class PmsAttrAttrgroupRelationServiceImpl implements PmsAttrAttrgroupRelationService{

    @Resource
    private PmsAttrAttrgroupRelationMapper pmsAttrAttrgroupRelationMapper;

}
