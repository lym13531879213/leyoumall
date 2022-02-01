package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.UmsGrowthChangeHistoryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.UmsGrowthChangeHistoryMapper;

@Service
public class UmsGrowthChangeHistoryServiceImpl implements UmsGrowthChangeHistoryService {

    @Resource
    private UmsGrowthChangeHistoryMapper umsGrowthChangeHistoryMapper;

}
