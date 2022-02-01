package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.UmsIntegrationChangeHistoryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.UmsIntegrationChangeHistoryMapper;

@Service
public class UmsIntegrationChangeHistoryServiceImpl implements UmsIntegrationChangeHistoryService {

    @Resource
    private UmsIntegrationChangeHistoryMapper umsIntegrationChangeHistoryMapper;

}
