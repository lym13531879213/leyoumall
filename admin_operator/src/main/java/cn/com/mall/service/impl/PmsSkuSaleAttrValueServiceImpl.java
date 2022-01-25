package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.PmsSkuSaleAttrValueMapper;
import cn.com.mall.service.PmsSkuSaleAttrValueService;
@Service
public class PmsSkuSaleAttrValueServiceImpl implements PmsSkuSaleAttrValueService{

    @Resource
    private PmsSkuSaleAttrValueMapper pmsSkuSaleAttrValueMapper;

}
