package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.PmsProductAttrValueService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.PmsProductAttrValueMapper;

@Service
public class PmsProductAttrValueServiceImpl implements PmsProductAttrValueService {

    @Resource
    private PmsProductAttrValueMapper pmsProductAttrValueMapper;

}
