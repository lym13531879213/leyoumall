package cn.com.mall.operator.service.impl;

import cn.com.mall.entity.OperateRole;
import cn.com.mall.operator.mapper.OperateRoleMapper;
import cn.com.mall.operator.pojo.dto.operator.AddRoleDTO;
import cn.com.mall.operator.pojo.dto.operator.ModifyRoleDTO;
import cn.com.mall.operator.service.OperateRoleService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OperateRoleServiceImpl implements OperateRoleService {

    @Resource
    private OperateRoleMapper operateRoleMapper;

    @Override
    public List<OperateRole> getPage(Object page, Long roleId, String roleName, Integer status) {
        PageHelper.startPage(page);
        return operateRoleMapper.getList(roleId, roleName, status);
    }

    @Override
    public boolean addRole(AddRoleDTO dto) {
        return operateRoleMapper.addRole(dto);
    }

    @Override
    public boolean switchStatus(Long roleId, Integer status) {
        return operateRoleMapper.switchStatus(roleId, status);
    }

    @Override
    public boolean modifyRole(Long roleId, ModifyRoleDTO dto) {
        return operateRoleMapper.modifyRole(roleId, dto.getRemark(), dto.getRoleName());
    }

    @Override
    public boolean deleteRole(Long roleId) {
        return operateRoleMapper.deleteRole(roleId);
    }

    @Override
    public OperateRole getById(Long roleId) {
        return operateRoleMapper.getById(roleId);
    }
}

