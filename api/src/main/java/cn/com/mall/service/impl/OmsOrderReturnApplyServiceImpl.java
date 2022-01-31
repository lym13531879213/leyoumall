package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.OmsOrderReturnApplyMapper;
import cn.com.mall.service.OmsOrderReturnApplyService;

@Service
public class OmsOrderReturnApplyServiceImpl implements OmsOrderReturnApplyService{

    @Resource
    private OmsOrderReturnApplyMapper omsOrderReturnApplyMapper;

}
