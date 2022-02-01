package cn.com.mall.api.service.impl;

import cn.com.mall.api.service.UmsMemberReceiveAddressService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.UmsMemberReceiveAddressMapper;

@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {

    @Resource
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

}
