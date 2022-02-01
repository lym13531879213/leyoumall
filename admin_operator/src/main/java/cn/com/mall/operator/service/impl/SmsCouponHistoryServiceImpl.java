package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.SmsCouponHistoryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.SmsCouponHistoryMapper;

@Service
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService {

    @Resource
    private SmsCouponHistoryMapper smsCouponHistoryMapper;

}
