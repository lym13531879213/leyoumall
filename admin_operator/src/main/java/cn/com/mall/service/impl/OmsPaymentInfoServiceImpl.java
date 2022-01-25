package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.OmsPaymentInfoMapper;
import cn.com.mall.service.OmsPaymentInfoService;
@Service
public class OmsPaymentInfoServiceImpl implements OmsPaymentInfoService{

    @Resource
    private OmsPaymentInfoMapper omsPaymentInfoMapper;

}
