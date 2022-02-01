package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.OmsPaymentInfoService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.OmsPaymentInfoMapper;

@Service
public class OmsPaymentInfoServiceImpl implements OmsPaymentInfoService {

    @Resource
    private OmsPaymentInfoMapper omsPaymentInfoMapper;

}
