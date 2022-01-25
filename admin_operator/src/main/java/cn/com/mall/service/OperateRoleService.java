package cn.com.mall.service;

import cn.com.mall.entity.OperateRole;
import cn.com.mall.pojo.dto.operator.AddRoleDTO;
import cn.com.mall.pojo.dto.operator.ModifyRoleDTO;

import java.util.List;

public interface OperateRoleService {

    List<OperateRole> getPage(Object page, Long roleId, String roleName, Integer status);

    boolean addRole(AddRoleDTO dto);

    boolean switchStatus(Long roleId, Integer status);

    boolean modifyRole(Long roleId, ModifyRoleDTO dto);

    boolean deleteRole(Long roleId);

    OperateRole getById(Long roleId);
}

