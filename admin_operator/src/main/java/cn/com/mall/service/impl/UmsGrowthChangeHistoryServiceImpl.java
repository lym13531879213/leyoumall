package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.UmsGrowthChangeHistoryMapper;
import cn.com.mall.service.UmsGrowthChangeHistoryService;
@Service
public class UmsGrowthChangeHistoryServiceImpl implements UmsGrowthChangeHistoryService{

    @Resource
    private UmsGrowthChangeHistoryMapper umsGrowthChangeHistoryMapper;

}
