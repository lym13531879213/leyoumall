package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.PmsAttrAttrgroupRelationService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.PmsAttrAttrgroupRelationMapper;

@Service
public class PmsAttrAttrgroupRelationServiceImpl implements PmsAttrAttrgroupRelationService {

    @Resource
    private PmsAttrAttrgroupRelationMapper pmsAttrAttrgroupRelationMapper;

}
