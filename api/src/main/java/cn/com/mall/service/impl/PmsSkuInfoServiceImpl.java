package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.PmsSkuInfoMapper;
import cn.com.mall.service.PmsSkuInfoService;

@Service
public class PmsSkuInfoServiceImpl implements PmsSkuInfoService{

    @Resource
    private PmsSkuInfoMapper pmsSkuInfoMapper;

}
