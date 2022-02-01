package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.UmsMemberStatisticsInfoService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.UmsMemberStatisticsInfoMapper;

@Service
public class UmsMemberStatisticsInfoServiceImpl implements UmsMemberStatisticsInfoService {

    @Resource
    private UmsMemberStatisticsInfoMapper umsMemberStatisticsInfoMapper;

}
