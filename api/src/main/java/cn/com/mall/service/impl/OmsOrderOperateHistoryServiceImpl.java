package cn.com.mall.service.impl;

import cn.com.mall.mapper.OmsOrderOperateHistoryMapper;
import cn.com.mall.service.OmsOrderOperateHistoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OmsOrderOperateHistoryServiceImpl implements OmsOrderOperateHistoryService{

    @Resource
    private OmsOrderOperateHistoryMapper omsOrderOperateHistoryMapper;

}
