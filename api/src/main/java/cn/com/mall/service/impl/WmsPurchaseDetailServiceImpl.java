package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.WmsPurchaseDetailMapper;
import cn.com.mall.service.WmsPurchaseDetailService;

@Service
public class WmsPurchaseDetailServiceImpl implements WmsPurchaseDetailService{

    @Resource
    private WmsPurchaseDetailMapper wmsPurchaseDetailMapper;

}
