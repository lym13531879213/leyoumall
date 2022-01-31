package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.OmsOrderMapper;
import cn.com.mall.service.OmsOrderService;

@Service
public class OmsOrderServiceImpl implements OmsOrderService{

    @Resource
    private OmsOrderMapper omsOrderMapper;

}
