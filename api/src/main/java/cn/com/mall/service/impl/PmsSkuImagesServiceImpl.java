package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.PmsSkuImagesMapper;
import cn.com.mall.service.PmsSkuImagesService;

@Service
public class PmsSkuImagesServiceImpl implements PmsSkuImagesService{

    @Resource
    private PmsSkuImagesMapper pmsSkuImagesMapper;

}
