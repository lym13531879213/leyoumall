package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.OmsOrderReturnApplyService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.OmsOrderReturnApplyMapper;

@Service
public class OmsOrderReturnApplyServiceImpl implements OmsOrderReturnApplyService {

    @Resource
    private OmsOrderReturnApplyMapper omsOrderReturnApplyMapper;

}
