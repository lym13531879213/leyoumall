package cn.com.mall.api.service.impl;

import cn.com.mall.api.service.PmsAttrService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.PmsAttrMapper;

@Service
public class PmsAttrServiceImpl implements PmsAttrService {

    @Resource
    private PmsAttrMapper pmsAttrMapper;

}
