package cn.com.mall.controller.operator;

import cn.com.mall.common.Result;
import cn.com.mall.common.ResultCode;
import cn.com.mall.controller.BaseController;
import cn.com.mall.pojo.dto.operator.AssignDTO;
import cn.com.mall.pojo.vo.operator.OperateMenuVO;
import cn.com.mall.service.OperateMenuService;
import cn.com.mall.service.OperateRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class OperatorMenuController extends BaseController {

    @Autowired
    OperateMenuService menuService;

    @Autowired
    OperateRoleMenuService roleMenuService;

    @GetMapping("tree")
    public Result<List<OperateMenuVO>> getTreeData(){
        List<OperateMenuVO> treeData = menuService.getTreeData();
        return Result.success(treeData);
    }

    @PostMapping("assgin")
    public Result assignMenuToRole(@RequestBody @Validated AssignDTO dto){
        boolean result = roleMenuService.assignMenuToRole(dto);
        if(!result){
            return Result.failure(ResultCode.FAIL,"分配菜单失败");
        }
        return Result.success();
    }
}
