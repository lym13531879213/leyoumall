package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.PmsAttrMapper;
import cn.com.mall.service.PmsAttrService;
@Service
public class PmsAttrServiceImpl implements PmsAttrService{

    @Resource
    private PmsAttrMapper pmsAttrMapper;

}
