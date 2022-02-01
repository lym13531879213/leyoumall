package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.pojo.vo.operator.OperateMenuVO;
import cn.com.mall.operator.service.OperateMenuService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.OperateMenuMapper;

import java.util.List;

@Service
public class OperateMenuServiceImpl implements OperateMenuService {

    @Resource
    private OperateMenuMapper operateMenuMapper;

    @Override
    public List<OperateMenuVO> getTreeData() {
        return operateMenuMapper.getTreeData();
    }

}

