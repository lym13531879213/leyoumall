package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.PmsSkuSaleAttrValueService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.PmsSkuSaleAttrValueMapper;

@Service
public class PmsSkuSaleAttrValueServiceImpl implements PmsSkuSaleAttrValueService {

    @Resource
    private PmsSkuSaleAttrValueMapper pmsSkuSaleAttrValueMapper;

}
