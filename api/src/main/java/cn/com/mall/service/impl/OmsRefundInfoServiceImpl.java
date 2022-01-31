package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.OmsRefundInfoMapper;
import cn.com.mall.service.OmsRefundInfoService;

@Service
public class OmsRefundInfoServiceImpl implements OmsRefundInfoService{

    @Resource
    private OmsRefundInfoMapper omsRefundInfoMapper;

}
