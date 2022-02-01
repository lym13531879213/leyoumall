package cn.com.mall.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.api.mapper.WmsWareOrderTaskMapper;
import cn.com.mall.api.service.WmsWareOrderTaskService;

@Service
public class WmsWareOrderTaskServiceImpl implements WmsWareOrderTaskService{

    @Resource
    private WmsWareOrderTaskMapper wmsWareOrderTaskMapper;

}
