package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.PmsSpuInfoDescMapper;
import cn.com.mall.api.service.PmsSpuInfoDescService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class PmsSpuInfoDescServiceImpl implements PmsSpuInfoDescService {

    @Resource
    private PmsSpuInfoDescMapper pmsSpuInfoDescMapper;

}
