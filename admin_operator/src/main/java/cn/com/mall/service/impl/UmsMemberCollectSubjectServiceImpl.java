package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.UmsMemberCollectSubjectMapper;
import cn.com.mall.service.UmsMemberCollectSubjectService;
@Service
public class UmsMemberCollectSubjectServiceImpl implements UmsMemberCollectSubjectService{

    @Resource
    private UmsMemberCollectSubjectMapper umsMemberCollectSubjectMapper;

}
