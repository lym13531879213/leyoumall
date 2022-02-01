package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.WmsPurchaseDetailService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.WmsPurchaseDetailMapper;

@Service
public class WmsPurchaseDetailServiceImpl implements WmsPurchaseDetailService {

    @Resource
    private WmsPurchaseDetailMapper wmsPurchaseDetailMapper;

}
