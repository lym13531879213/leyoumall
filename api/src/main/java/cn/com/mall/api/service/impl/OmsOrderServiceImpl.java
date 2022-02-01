package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.OmsOrderMapper;
import cn.com.mall.api.service.OmsOrderService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class OmsOrderServiceImpl implements OmsOrderService {

    @Resource
    private OmsOrderMapper omsOrderMapper;

}
