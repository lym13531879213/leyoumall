package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.OmsOrderItemMapper;
import cn.com.mall.service.OmsOrderItemService;

@Service
public class OmsOrderItemServiceImpl implements OmsOrderItemService{

    @Resource
    private OmsOrderItemMapper omsOrderItemMapper;

}
