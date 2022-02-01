package cn.com.mall.api.service.impl;

import cn.com.mall.api.service.WmsWareInfoService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.WmsWareInfoMapper;

@Service
public class WmsWareInfoServiceImpl implements WmsWareInfoService {

    @Resource
    private WmsWareInfoMapper wmsWareInfoMapper;

}
