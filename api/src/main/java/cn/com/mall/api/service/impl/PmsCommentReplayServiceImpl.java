package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.PmsCommentReplayMapper;
import cn.com.mall.api.service.PmsCommentReplayService;

@Service
public class PmsCommentReplayServiceImpl implements PmsCommentReplayService{

    @Resource
    private PmsCommentReplayMapper pmsCommentReplayMapper;

}
