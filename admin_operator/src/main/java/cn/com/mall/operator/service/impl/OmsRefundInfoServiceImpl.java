package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.OmsRefundInfoService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.OmsRefundInfoMapper;

@Service
public class OmsRefundInfoServiceImpl implements OmsRefundInfoService {

    @Resource
    private OmsRefundInfoMapper omsRefundInfoMapper;

}
