package cn.com.mall.api.service.impl;

import cn.com.mall.api.service.SmsMemberPriceService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.SmsMemberPriceMapper;

@Service
public class SmsMemberPriceServiceImpl implements SmsMemberPriceService {

    @Resource
    private SmsMemberPriceMapper smsMemberPriceMapper;

}
