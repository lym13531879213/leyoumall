package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.OmsOrderSettingService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.OmsOrderSettingMapper;

@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {

    @Resource
    private OmsOrderSettingMapper omsOrderSettingMapper;

}
