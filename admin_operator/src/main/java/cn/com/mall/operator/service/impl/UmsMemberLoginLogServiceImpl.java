package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.UmsMemberLoginLogService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.UmsMemberLoginLogMapper;

@Service
public class UmsMemberLoginLogServiceImpl implements UmsMemberLoginLogService {

    @Resource
    private UmsMemberLoginLogMapper umsMemberLoginLogMapper;

}
