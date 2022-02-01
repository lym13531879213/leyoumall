package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.OmsOrderItemService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.OmsOrderItemMapper;

@Service
public class OmsOrderItemServiceImpl implements OmsOrderItemService {

    @Resource
    private OmsOrderItemMapper omsOrderItemMapper;

}
