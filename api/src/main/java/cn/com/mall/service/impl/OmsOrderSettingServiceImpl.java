package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.OmsOrderSettingMapper;
import cn.com.mall.service.OmsOrderSettingService;

@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService{

    @Resource
    private OmsOrderSettingMapper omsOrderSettingMapper;

}
