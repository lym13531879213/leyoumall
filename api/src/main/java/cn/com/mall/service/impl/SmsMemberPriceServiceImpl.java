package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.SmsMemberPriceMapper;
import cn.com.mall.service.SmsMemberPriceService;

@Service
public class SmsMemberPriceServiceImpl implements SmsMemberPriceService{

    @Resource
    private SmsMemberPriceMapper smsMemberPriceMapper;

}
