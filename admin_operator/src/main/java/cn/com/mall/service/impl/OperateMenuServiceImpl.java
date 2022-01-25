package cn.com.mall.service.impl;

import cn.com.mall.pojo.vo.operator.OperateMenuVO;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.OperateMenuMapper;
import cn.com.mall.service.OperateMenuService;

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

