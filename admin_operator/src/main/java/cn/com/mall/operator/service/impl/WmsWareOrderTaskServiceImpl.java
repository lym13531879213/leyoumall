package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.WmsWareOrderTaskService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.WmsWareOrderTaskMapper;

@Service
public class WmsWareOrderTaskServiceImpl implements WmsWareOrderTaskService {

    @Resource
    private WmsWareOrderTaskMapper wmsWareOrderTaskMapper;

}
