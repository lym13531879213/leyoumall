package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.OmsRefundInfoMapper;
import cn.com.mall.api.service.OmsRefundInfoService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class OmsRefundInfoServiceImpl implements OmsRefundInfoService {

    @Resource
    private OmsRefundInfoMapper omsRefundInfoMapper;

}
