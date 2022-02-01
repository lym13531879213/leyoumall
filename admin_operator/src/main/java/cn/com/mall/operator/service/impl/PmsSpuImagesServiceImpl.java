package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.PmsSpuImagesService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.PmsSpuImagesMapper;

@Service
public class PmsSpuImagesServiceImpl implements PmsSpuImagesService {

    @Resource
    private PmsSpuImagesMapper pmsSpuImagesMapper;

}
