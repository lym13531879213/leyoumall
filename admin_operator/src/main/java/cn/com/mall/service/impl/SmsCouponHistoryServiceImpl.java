package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.SmsCouponHistoryMapper;
import cn.com.mall.service.SmsCouponHistoryService;
@Service
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService{

    @Resource
    private SmsCouponHistoryMapper smsCouponHistoryMapper;

}
