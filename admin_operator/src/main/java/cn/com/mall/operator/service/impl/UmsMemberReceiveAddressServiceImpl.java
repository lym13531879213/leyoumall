package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.UmsMemberReceiveAddressService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.UmsMemberReceiveAddressMapper;

@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {

    @Resource
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

}
