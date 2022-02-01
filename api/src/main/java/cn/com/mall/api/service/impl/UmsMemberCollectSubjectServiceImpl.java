package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.UmsMemberCollectSubjectMapper;
import cn.com.mall.api.service.UmsMemberCollectSubjectService;

@Service
public class UmsMemberCollectSubjectServiceImpl implements UmsMemberCollectSubjectService{

    @Resource
    private UmsMemberCollectSubjectMapper umsMemberCollectSubjectMapper;

}
