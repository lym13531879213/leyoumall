package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.UmsGrowthChangeHistoryMapper;
import cn.com.mall.api.service.UmsGrowthChangeHistoryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UmsGrowthChangeHistoryServiceImpl implements UmsGrowthChangeHistoryService {

    @Resource
    private UmsGrowthChangeHistoryMapper umsGrowthChangeHistoryMapper;

}
