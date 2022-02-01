package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.OmsOrderReturnReasonService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.OmsOrderReturnReasonMapper;

@Service
public class OmsOrderReturnReasonServiceImpl implements OmsOrderReturnReasonService {

    @Resource
    private OmsOrderReturnReasonMapper omsOrderReturnReasonMapper;

}
