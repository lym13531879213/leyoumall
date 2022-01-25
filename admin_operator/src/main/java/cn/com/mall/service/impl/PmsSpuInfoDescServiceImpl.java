package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.PmsSpuInfoDescMapper;
import cn.com.mall.service.PmsSpuInfoDescService;
@Service
public class PmsSpuInfoDescServiceImpl implements PmsSpuInfoDescService{

    @Resource
    private PmsSpuInfoDescMapper pmsSpuInfoDescMapper;

}
