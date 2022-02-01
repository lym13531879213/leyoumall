package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.PmsAttrService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.PmsAttrMapper;

@Service
public class PmsAttrServiceImpl implements PmsAttrService {

    @Resource
    private PmsAttrMapper pmsAttrMapper;

}
