package cn.com.mall.operator.mapper;

import cn.com.mall.operator.pojo.vo.operator.OperateMenuVO;

import java.util.List;

public interface OperateMenuMapper {
    List<OperateMenuVO> getTreeData();
}