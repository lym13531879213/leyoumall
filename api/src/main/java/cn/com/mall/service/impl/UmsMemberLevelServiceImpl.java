package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.UmsMemberLevelMapper;
import cn.com.mall.service.UmsMemberLevelService;

@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService{

    @Resource
    private UmsMemberLevelMapper umsMemberLevelMapper;

}
