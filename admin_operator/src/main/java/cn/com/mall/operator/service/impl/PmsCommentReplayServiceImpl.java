package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.PmsCommentReplayService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.PmsCommentReplayMapper;

@Service
public class PmsCommentReplayServiceImpl implements PmsCommentReplayService {

    @Resource
    private PmsCommentReplayMapper pmsCommentReplayMapper;

}
