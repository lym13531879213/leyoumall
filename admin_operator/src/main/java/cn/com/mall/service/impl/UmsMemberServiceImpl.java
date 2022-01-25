package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.UmsMemberMapper;
import cn.com.mall.service.UmsMemberService;
@Service
public class UmsMemberServiceImpl implements UmsMemberService{

    @Resource
    private UmsMemberMapper umsMemberMapper;

}
