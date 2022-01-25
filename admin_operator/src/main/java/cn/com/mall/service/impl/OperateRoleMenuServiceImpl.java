package cn.com.mall.service.impl;

import cn.com.mall.pojo.dto.operator.AssignDTO;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.mall.mapper.OperateRoleMenuMapper;
import cn.com.mall.service.OperateRoleMenuService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OperateRoleMenuServiceImpl implements OperateRoleMenuService {

    @Resource
    private OperateRoleMenuMapper roleMenuMapper;

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public boolean assignMenuToRole(AssignDTO dto) {
        //删除之前该角色具有的所有菜单
        boolean deleteResult = roleMenuMapper.deleteOriginMenu(dto);
        boolean addResult = roleMenuMapper.assignMenuToRole(dto);
        return deleteResult && addResult;
    }
}

