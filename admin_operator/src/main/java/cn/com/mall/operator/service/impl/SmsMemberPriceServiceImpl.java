package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.SmsMemberPriceService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.SmsMemberPriceMapper;

@Service
public class SmsMemberPriceServiceImpl implements SmsMemberPriceService {

    @Resource
    private SmsMemberPriceMapper smsMemberPriceMapper;

}
