package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.UmsMemberStatisticsInfoMapper;
import cn.com.mall.service.UmsMemberStatisticsInfoService;
@Service
public class UmsMemberStatisticsInfoServiceImpl implements UmsMemberStatisticsInfoService{

    @Resource
    private UmsMemberStatisticsInfoMapper umsMemberStatisticsInfoMapper;

}
