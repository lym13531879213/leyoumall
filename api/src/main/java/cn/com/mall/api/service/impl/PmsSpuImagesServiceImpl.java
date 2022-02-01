package cn.com.mall.api.service.impl;

import cn.com.mall.api.service.PmsSpuImagesService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.PmsSpuImagesMapper;

@Service
public class PmsSpuImagesServiceImpl implements PmsSpuImagesService {

    @Resource
    private PmsSpuImagesMapper pmsSpuImagesMapper;

}
