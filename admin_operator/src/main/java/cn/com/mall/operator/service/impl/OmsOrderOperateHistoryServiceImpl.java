package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.OmsOrderOperateHistoryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.OmsOrderOperateHistoryMapper;

@Service
public class OmsOrderOperateHistoryServiceImpl implements OmsOrderOperateHistoryService {

    @Resource
    private OmsOrderOperateHistoryMapper omsOrderOperateHistoryMapper;

}
