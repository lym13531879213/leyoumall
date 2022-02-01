package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.PmsAttrGroupMapper;
import cn.com.mall.api.service.PmsAttrGroupService;

@Service
public class PmsAttrGroupServiceImpl implements PmsAttrGroupService{

    @Resource
    private PmsAttrGroupMapper pmsAttrGroupMapper;

}
