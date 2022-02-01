package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.PmsAttrGroupService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.PmsAttrGroupMapper;

@Service
public class PmsAttrGroupServiceImpl implements PmsAttrGroupService {

    @Resource
    private PmsAttrGroupMapper pmsAttrGroupMapper;

}
