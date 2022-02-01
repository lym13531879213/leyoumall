package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.PmsSkuInfoService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.PmsSkuInfoMapper;

@Service
public class PmsSkuInfoServiceImpl implements PmsSkuInfoService {

    @Resource
    private PmsSkuInfoMapper pmsSkuInfoMapper;

}
