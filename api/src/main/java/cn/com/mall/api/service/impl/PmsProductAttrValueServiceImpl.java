package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.PmsProductAttrValueMapper;
import cn.com.mall.api.service.PmsProductAttrValueService;

@Service
public class PmsProductAttrValueServiceImpl implements PmsProductAttrValueService{

    @Resource
    private PmsProductAttrValueMapper pmsProductAttrValueMapper;

}
