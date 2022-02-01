package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.UmsMemberCollectSubjectService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.UmsMemberCollectSubjectMapper;

@Service
public class UmsMemberCollectSubjectServiceImpl implements UmsMemberCollectSubjectService {

    @Resource
    private UmsMemberCollectSubjectMapper umsMemberCollectSubjectMapper;

}
