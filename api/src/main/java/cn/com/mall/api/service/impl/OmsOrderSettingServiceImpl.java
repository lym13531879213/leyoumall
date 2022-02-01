package cn.com.mall.api.service.impl;

import cn.com.mall.api.service.OmsOrderSettingService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.OmsOrderSettingMapper;

@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {

    @Resource
    private OmsOrderSettingMapper omsOrderSettingMapper;

}
