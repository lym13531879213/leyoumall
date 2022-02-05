package cn.com.mall.operator.controller.pms;

import cn.com.mall.common.Result;
import cn.com.mall.common.ResultCode;
import cn.com.mall.entity.PmsAttrGroup;
import cn.com.mall.operator.controller.BaseController;
import cn.com.mall.operator.pojo.dto.pms.AttrGroupDTO;
import cn.com.mall.operator.service.PmsAttrGroupService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author liaoyuming
 * @date 2022/2/3 14:52
 * @Description
 */
@RestController
@RequestMapping("/goods/attrGroup")
public class AttrGroupController extends BaseController {

    @Autowired
    private PmsAttrGroupService attrGroupService;

    @GetMapping("page")
    public Result<PageInfo<PmsAttrGroup>> getPage(Integer pageNo, Integer pageSize, Long catId, Long groupId, String attrGroupName) {
        Object page = super.getPage();
        List<PmsAttrGroup> list = attrGroupService.getPage(page, catId, groupId, attrGroupName);
        PageInfo<PmsAttrGroup> pmsAttrPageInfo = new PageInfo<>(list);
        return Result.success(pmsAttrPageInfo);
    }

    @PostMapping("")
    public Result addAttrGroup(@RequestBody @Validated AttrGroupDTO dto) {
        boolean result = attrGroupService.addAttrGroup(dto);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "新增属性分组失败");
        }
        return Result.success();
    }

    @DeleteMapping("{attrGroupId}")
    public Result deleteAttrGroup(@PathVariable Long attrGroupId) {
        boolean result = attrGroupService.deleteAttrGroup(attrGroupId);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "删除属性分组失败");
        }
        return Result.success();
    }

    @GetMapping("{attrGroupId}")
    public Result<PmsAttrGroup> getAttrGroup(@PathVariable Long attrGroupId) {
        return Result.success(attrGroupService.getAttrGroup(attrGroupId));
    }

    @PutMapping("")
    public Result putAttrGroup(@RequestBody @Validated AttrGroupDTO dto) {
        boolean result = attrGroupService.putAttrGroup(dto);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "修改属性分组失败");
        }
        return Result.success();
    }
}
