package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.UmsMemberService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.UmsMemberMapper;

@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Resource
    private UmsMemberMapper umsMemberMapper;

}
