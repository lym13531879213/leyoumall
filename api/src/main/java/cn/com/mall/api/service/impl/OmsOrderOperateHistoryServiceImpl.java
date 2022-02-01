package cn.com.mall.api.service.impl;

import cn.com.mall.api.service.OmsOrderOperateHistoryService;
import cn.com.mall.api.mapper.OmsOrderOperateHistoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OmsOrderOperateHistoryServiceImpl implements OmsOrderOperateHistoryService {

    @Resource
    private OmsOrderOperateHistoryMapper omsOrderOperateHistoryMapper;

}
