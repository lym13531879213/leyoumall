package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.WmsPurchaseMapper;
import cn.com.mall.service.WmsPurchaseService;

@Service
public class WmsPurchaseServiceImpl implements WmsPurchaseService{

    @Resource
    private WmsPurchaseMapper wmsPurchaseMapper;

}
