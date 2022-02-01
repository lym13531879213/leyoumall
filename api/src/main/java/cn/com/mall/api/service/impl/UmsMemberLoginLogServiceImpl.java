package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.UmsMemberLoginLogMapper;
import cn.com.mall.api.service.UmsMemberLoginLogService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UmsMemberLoginLogServiceImpl implements UmsMemberLoginLogService {

    @Resource
    private UmsMemberLoginLogMapper umsMemberLoginLogMapper;

}
