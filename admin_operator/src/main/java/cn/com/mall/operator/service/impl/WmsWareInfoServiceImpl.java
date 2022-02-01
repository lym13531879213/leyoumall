package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.WmsWareInfoService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.WmsWareInfoMapper;

@Service
public class WmsWareInfoServiceImpl implements WmsWareInfoService {

    @Resource
    private WmsWareInfoMapper wmsWareInfoMapper;

}
