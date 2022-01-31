package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.UmsMemberLoginLogMapper;
import cn.com.mall.service.UmsMemberLoginLogService;

@Service
public class UmsMemberLoginLogServiceImpl implements UmsMemberLoginLogService{

    @Resource
    private UmsMemberLoginLogMapper umsMemberLoginLogMapper;

}
