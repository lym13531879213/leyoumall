package cn.com.mall.operator.mapper;

import cn.com.mall.operator.pojo.dto.operator.AssignDTO;

public interface OperateRoleMenuMapper {
    boolean deleteOriginMenu(AssignDTO dto);

    boolean assignMenuToRole(AssignDTO dto);
}