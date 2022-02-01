package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.UmsMemberLevelService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.UmsMemberLevelMapper;

@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {

    @Resource
    private UmsMemberLevelMapper umsMemberLevelMapper;

}
