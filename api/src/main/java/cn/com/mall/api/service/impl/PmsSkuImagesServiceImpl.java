package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.PmsSkuImagesMapper;
import cn.com.mall.api.service.PmsSkuImagesService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class PmsSkuImagesServiceImpl implements PmsSkuImagesService {

    @Resource
    private PmsSkuImagesMapper pmsSkuImagesMapper;

}
