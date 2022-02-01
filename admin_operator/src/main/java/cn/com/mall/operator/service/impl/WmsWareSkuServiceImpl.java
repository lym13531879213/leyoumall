package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.WmsWareSkuService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.WmsWareSkuMapper;

@Service
public class WmsWareSkuServiceImpl implements WmsWareSkuService {

    @Resource
    private WmsWareSkuMapper wmsWareSkuMapper;

}
