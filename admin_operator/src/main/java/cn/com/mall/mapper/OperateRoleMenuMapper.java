package cn.com.mall.mapper;

import cn.com.mall.pojo.dto.operator.AssignDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OperateRoleMenuMapper {
    boolean deleteOriginMenu(AssignDTO dto);

    boolean assignMenuToRole(AssignDTO dto);
}