package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.WmsPurchaseService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.WmsPurchaseMapper;

@Service
public class WmsPurchaseServiceImpl implements WmsPurchaseService {

    @Resource
    private WmsPurchaseMapper wmsPurchaseMapper;

}
