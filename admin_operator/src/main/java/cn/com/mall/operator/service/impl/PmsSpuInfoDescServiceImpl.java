package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.PmsSpuInfoDescService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.PmsSpuInfoDescMapper;

@Service
public class PmsSpuInfoDescServiceImpl implements PmsSpuInfoDescService {

    @Resource
    private PmsSpuInfoDescMapper pmsSpuInfoDescMapper;

}
