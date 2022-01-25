package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.OmsOrderReturnReasonMapper;
import cn.com.mall.service.OmsOrderReturnReasonService;
@Service
public class OmsOrderReturnReasonServiceImpl implements OmsOrderReturnReasonService{

    @Resource
    private OmsOrderReturnReasonMapper omsOrderReturnReasonMapper;

}
