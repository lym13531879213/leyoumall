package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.PmsProductAttrValueMapper;
import cn.com.mall.service.PmsProductAttrValueService;
@Service
public class PmsProductAttrValueServiceImpl implements PmsProductAttrValueService{

    @Resource
    private PmsProductAttrValueMapper pmsProductAttrValueMapper;

}
