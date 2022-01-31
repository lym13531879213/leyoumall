package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.WmsWareOrderTaskMapper;
import cn.com.mall.service.WmsWareOrderTaskService;

@Service
public class WmsWareOrderTaskServiceImpl implements WmsWareOrderTaskService{

    @Resource
    private WmsWareOrderTaskMapper wmsWareOrderTaskMapper;

}
