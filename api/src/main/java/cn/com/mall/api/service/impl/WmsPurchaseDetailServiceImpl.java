package cn.com.mall.api.service.impl;

import cn.com.mall.api.service.WmsPurchaseDetailService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.WmsPurchaseDetailMapper;

@Service
public class WmsPurchaseDetailServiceImpl implements WmsPurchaseDetailService {

    @Resource
    private WmsPurchaseDetailMapper wmsPurchaseDetailMapper;

}
