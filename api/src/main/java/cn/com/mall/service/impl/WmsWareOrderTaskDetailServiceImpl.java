package cn.com.mall.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.WmsWareOrderTaskDetailMapper;
import cn.com.mall.service.WmsWareOrderTaskDetailService;

@Service
public class WmsWareOrderTaskDetailServiceImpl implements WmsWareOrderTaskDetailService{

    @Resource
    private WmsWareOrderTaskDetailMapper wmsWareOrderTaskDetailMapper;

}
