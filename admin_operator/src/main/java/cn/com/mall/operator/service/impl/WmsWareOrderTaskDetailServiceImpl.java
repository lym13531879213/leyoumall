package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.service.WmsWareOrderTaskDetailService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.WmsWareOrderTaskDetailMapper;

@Service
public class WmsWareOrderTaskDetailServiceImpl implements WmsWareOrderTaskDetailService {

    @Resource
    private WmsWareOrderTaskDetailMapper wmsWareOrderTaskDetailMapper;

}
