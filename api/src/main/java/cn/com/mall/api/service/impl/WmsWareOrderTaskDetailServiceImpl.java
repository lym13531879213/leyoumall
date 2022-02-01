package cn.com.mall.api.service.impl;

import cn.com.mall.api.mapper.WmsWareOrderTaskDetailMapper;
import cn.com.mall.api.service.WmsWareOrderTaskDetailService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class WmsWareOrderTaskDetailServiceImpl implements WmsWareOrderTaskDetailService {

    @Resource
    private WmsWareOrderTaskDetailMapper wmsWareOrderTaskDetailMapper;

}
