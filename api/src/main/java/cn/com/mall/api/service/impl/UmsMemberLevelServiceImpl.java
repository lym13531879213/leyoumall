package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.UmsMemberLevelMapper;
import cn.com.mall.api.service.UmsMemberLevelService;

@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService{

    @Resource
    private UmsMemberLevelMapper umsMemberLevelMapper;

}
