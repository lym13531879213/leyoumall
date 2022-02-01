package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.PmsSkuImagesService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.PmsSkuImagesMapper;

@Service
public class PmsSkuImagesServiceImpl implements PmsSkuImagesService {

    @Resource
    private PmsSkuImagesMapper pmsSkuImagesMapper;

}
