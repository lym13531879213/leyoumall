package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.PmsAttrGroupMapper;
import cn.com.mall.service.PmsAttrGroupService;

@Service
public class PmsAttrGroupServiceImpl implements PmsAttrGroupService{

    @Resource
    private PmsAttrGroupMapper pmsAttrGroupMapper;

}
