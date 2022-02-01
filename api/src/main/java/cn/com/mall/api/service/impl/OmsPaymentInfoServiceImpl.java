package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.OmsPaymentInfoMapper;
import cn.com.mall.api.service.OmsPaymentInfoService;

@Service
public class OmsPaymentInfoServiceImpl implements OmsPaymentInfoService{

    @Resource
    private OmsPaymentInfoMapper omsPaymentInfoMapper;

}
