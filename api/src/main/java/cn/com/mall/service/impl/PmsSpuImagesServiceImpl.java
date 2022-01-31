package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.PmsSpuImagesMapper;
import cn.com.mall.service.PmsSpuImagesService;

@Service
public class PmsSpuImagesServiceImpl implements PmsSpuImagesService{

    @Resource
    private PmsSpuImagesMapper pmsSpuImagesMapper;

}
