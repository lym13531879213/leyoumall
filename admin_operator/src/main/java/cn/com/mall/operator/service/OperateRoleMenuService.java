package cn.com.mall.operator.service;

import cn.com.mall.operator.pojo.dto.operator.AssignDTO;

import java.util.List;

public interface OperateRoleMenuService {


    boolean assignMenuToRole(AssignDTO dto);

    List<String> getMenuByOperatorId(long opeatorId);
}

