package cn.com.mall.operator.mapper;

import cn.com.mall.entity.OperateRole;
import cn.com.mall.operator.pojo.dto.operator.AddRoleDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface OperateRoleMapper {
    List<OperateRole> getList(@Param("roleId") Long roleId, @Param("roleName") String roleName, @Param("status") Integer status);

    boolean addRole(AddRoleDTO dto);

    @Update("update leyoumall.operate_role set `status` = #{status} , update_time = now() where role_id = #{roleId}")
    boolean switchStatus(@Param("roleId") Long roleId, @Param("status") Integer status);

    boolean modifyRole(@Param("roleId") Long roleId,@Param("remark") String remark,@Param("roleName") String roleName);

    @Update("update leyoumall.operate_role set deleted = 1 , update_time = now() where role_id = #{roleId}")
    boolean deleteRole(@Param("roleId") Long roleId);

    OperateRole getById(Long roleId);
}