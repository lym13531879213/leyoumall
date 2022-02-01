package cn.com.mall.api.service.impl;

import cn.com.mall.api.service.WmsPurchaseService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.WmsPurchaseMapper;

@Service
public class WmsPurchaseServiceImpl implements WmsPurchaseService {

    @Resource
    private WmsPurchaseMapper wmsPurchaseMapper;

}
