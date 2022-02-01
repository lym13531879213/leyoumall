package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.UmsIntegrationChangeHistoryMapper;
import cn.com.mall.api.service.UmsIntegrationChangeHistoryService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UmsIntegrationChangeHistoryServiceImpl implements UmsIntegrationChangeHistoryService {

    @Resource
    private UmsIntegrationChangeHistoryMapper umsIntegrationChangeHistoryMapper;

}
