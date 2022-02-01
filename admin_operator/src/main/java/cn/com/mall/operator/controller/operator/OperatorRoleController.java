package cn.com.mall.operator.controller.operator;

import cn.com.mall.common.Result;
import cn.com.mall.operator.controller.BaseController;
import cn.com.mall.entity.OperateRole;
import cn.com.mall.operator.pojo.dto.operator.AddRoleDTO;
import cn.com.mall.operator.pojo.dto.operator.ModifyRoleDTO;
import cn.com.mall.operator.service.OperateRoleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class OperatorRoleController extends BaseController {
    @Autowired
    OperateRoleService operateRoleService;

    @PostMapping("")
    public Result addRole(@RequestBody @Validated AddRoleDTO dto) {
        boolean result = operateRoleService.addRole(dto);
        if (!result) {
            return Result.success("新增角色失败");
        }
        return Result.success();
    }

    /**
     * 状态  0:禁用   1:正常
     */
    @PutMapping("/{roleId}/status/{status}")
    public Result switchStatus(@PathVariable Long roleId, @PathVariable Integer status) {
        boolean result = operateRoleService.switchStatus(roleId, status);
        if (!result) {
            return Result.success("切换失败");
        }
        return Result.success();
    }

    @GetMapping("page")
    public Result<PageInfo<OperateRole>> getPage(Integer pageNo, Integer PageSize, Long roleId, String roleName, Integer status) {
        Object page = super.getPage();
        List<OperateRole> roles = operateRoleService.getPage(page, roleId, roleName, status);
        PageInfo<OperateRole> operateRolePageInfo = new PageInfo<>(roles);
        return Result.success(operateRolePageInfo);
    }

    @GetMapping("{roleId}")
    public Result<OperateRole> getRoleById(@PathVariable Long roleId){
        return  Result.success(operateRoleService.getById(roleId));
    }

    @PutMapping("{roleId}")
    public Result modifyRole(@PathVariable Long roleId, @RequestBody @Validated ModifyRoleDTO dto) {
        boolean result = operateRoleService.modifyRole(roleId, dto);
        if (!result) {
            return Result.success("修改角色失败");
        }
        return Result.success();
    }

    @DeleteMapping("{roleId}")
    public Result deleteRole(@PathVariable Long roleId) {
        boolean result = operateRoleService.deleteRole(roleId);
        if (!result) {
            return Result.success("删除角色失败");
        }
        return Result.success();
    }
}
