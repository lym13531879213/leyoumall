package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.PmsSkuInfoMapper;
import cn.com.mall.api.service.PmsSkuInfoService;

@Service
public class PmsSkuInfoServiceImpl implements PmsSkuInfoService{

    @Resource
    private PmsSkuInfoMapper pmsSkuInfoMapper;

}
