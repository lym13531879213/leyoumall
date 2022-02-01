package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.OmsOrderReturnReasonMapper;
import cn.com.mall.api.service.OmsOrderReturnReasonService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class OmsOrderReturnReasonServiceImpl implements OmsOrderReturnReasonService {

    @Resource
    private OmsOrderReturnReasonMapper omsOrderReturnReasonMapper;

}
