package cn.com.mall.operator.mapper;

import cn.com.mall.operator.pojo.dto.operator.AssignDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OperateRoleMenuMapper {
    boolean deleteOriginMenu(AssignDTO dto);

    boolean assignMenuToRole(AssignDTO dto);

    List<String> getMenuByOperatorId(@Param("operatorId") long operatorId,@Param("roleIds") List<Long> roleIds);
}