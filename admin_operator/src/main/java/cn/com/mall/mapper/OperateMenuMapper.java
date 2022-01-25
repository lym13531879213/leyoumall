package cn.com.mall.mapper;

import cn.com.mall.pojo.vo.operator.OperateMenuVO;

import java.util.List;

public interface OperateMenuMapper {
    List<OperateMenuVO> getTreeData();
}