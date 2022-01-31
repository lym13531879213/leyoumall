package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.WmsWareInfoMapper;
import cn.com.mall.service.WmsWareInfoService;

@Service
public class WmsWareInfoServiceImpl implements WmsWareInfoService{

    @Resource
    private WmsWareInfoMapper wmsWareInfoMapper;

}
