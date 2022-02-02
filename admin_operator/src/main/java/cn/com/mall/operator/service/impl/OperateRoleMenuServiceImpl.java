package cn.com.mall.operator.service.impl;

import cn.com.mall.operator.mapper.OperateRoleMapper;
import cn.com.mall.operator.pojo.dto.operator.AssignDTO;
import cn.com.mall.operator.service.OperateRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.operator.mapper.OperateRoleMenuMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OperateRoleMenuServiceImpl implements OperateRoleMenuService {

    @Resource
    private OperateRoleMenuMapper roleMenuMapper;

    @Autowired
    private OperateRoleMapper roleMapper;

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public boolean assignMenuToRole(AssignDTO dto) {
        //删除之前该角色具有的所有菜单
        boolean deleteResult = roleMenuMapper.deleteOriginMenu(dto);
        boolean addResult = roleMenuMapper.assignMenuToRole(dto);
        return deleteResult && addResult;
    }

    @Override
    public List<String> getMenuByOperatorId(long operatorId) {
        List<Long> roleIds = roleMapper.getRoleList(operatorId);
       return roleMenuMapper.getMenuByOperatorId(operatorId,roleIds);
    }
}

