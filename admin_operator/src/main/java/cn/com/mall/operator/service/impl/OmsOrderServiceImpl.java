package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.OmsOrderService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.OmsOrderMapper;

@Service
public class OmsOrderServiceImpl implements OmsOrderService {

    @Resource
    private OmsOrderMapper omsOrderMapper;

}
