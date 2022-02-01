package cn.com.mall.api.service.impl;

import cn.com.mall.api.service.SmsCouponHistoryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.SmsCouponHistoryMapper;

@Service
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService {

    @Resource
    private SmsCouponHistoryMapper smsCouponHistoryMapper;

}
