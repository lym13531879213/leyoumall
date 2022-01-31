package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.WmsWareSkuMapper;
import cn.com.mall.service.WmsWareSkuService;

@Service
public class WmsWareSkuServiceImpl implements WmsWareSkuService{

    @Resource
    private WmsWareSkuMapper wmsWareSkuMapper;

}
