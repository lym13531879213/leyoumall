package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.OmsOrderItemMapper;
import cn.com.mall.api.service.OmsOrderItemService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class OmsOrderItemServiceImpl implements OmsOrderItemService {

    @Resource
    private OmsOrderItemMapper omsOrderItemMapper;

}
