package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.PmsCommentReplayMapper;
import cn.com.mall.service.PmsCommentReplayService;

@Service
public class PmsCommentReplayServiceImpl implements PmsCommentReplayService{

    @Resource
    private PmsCommentReplayMapper pmsCommentReplayMapper;

}
