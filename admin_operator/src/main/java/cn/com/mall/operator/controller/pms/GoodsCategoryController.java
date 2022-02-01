package cn.com.mall.operator.controller.pms;

import cn.com.mall.common.Result;
import cn.com.mall.common.ResultCode;
import cn.com.mall.common.enums.StatusEnum;
import cn.com.mall.operator.controller.BaseController;
import cn.com.mall.entity.PmsCategory;
import cn.com.mall.operator.pojo.dto.pms.AddCategoryDTO;
import cn.com.mall.operator.pojo.dto.pms.ModifyCategoryDTO;
import cn.com.mall.operator.pojo.dto.pms.TransferCategoryDTO;
import cn.com.mall.operator.pojo.vo.pms.ModifyCategoryVO;
import cn.com.mall.operator.service.PmsCategoryService;
import cn.com.mall.utils.AssertUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goods/category")
public class GoodsCategoryController extends BaseController {

    @Autowired
    private PmsCategoryService categoryService;

    @GetMapping("/page")
    public Result<PageInfo<PmsCategory>> getPage(Integer pageNo, Integer pageSize, Long catId, String name, Long parentCid, Integer catLevel, Integer showStatus) {
        Object page = super.getPage();
        List<PmsCategory> categories = categoryService.getPage(page, catId, name, parentCid, catLevel, showStatus);
        PageInfo<PmsCategory> pageInfo = new PageInfo<>(categories);
        return Result.success(pageInfo);
    }

    /**
     * 切换显示状态
     *
     * @param showStatus 是否显示[0-不显示，1显示]
     * @return
     */
    @PutMapping("/{catId}/status/{showStatus}")
    public Result switchStatus(@PathVariable Long catId, @PathVariable Integer showStatus) {
        AssertUtil.isTrue(StatusEnum.STATUS_YES.getStatus().equals(showStatus) ||
                StatusEnum.STATUS_NO.getStatus().equals(showStatus), "请正确传递参数");
        boolean result = categoryService.switchStatus(catId, showStatus);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "切换显示状态失败");
        }
        return Result.success();
    }

    /**
     * 逻辑删除【级联】商品分类
     *
     * @param catId 分类id
     * @return
     */
    @DeleteMapping("/{catId}")
    public Result deleteCategory(@PathVariable Long catId) {
        boolean result = categoryService.deleteCategory(catId);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "删除商品分类失败");
        }
        return Result.success();
    }

    /**
     * 回显修改分类数据
     *
     * @param catId 分类id
     * @return
     */
    @GetMapping("/{catId}")
    public Result<ModifyCategoryVO> getModifyCategoryVO(@PathVariable Long catId) {
        return Result.success(categoryService.getModifyCategoryVO(catId));
    }

    /**
     * 修改商品分类信息
     *
     * @param catId 分类id
     * @param dto   修改表单
     * @return
     */
    @PutMapping("/{catId}")
    public Result modifyCategory(@PathVariable Long catId, @RequestBody @Validated ModifyCategoryDTO dto) {
        boolean result = categoryService.modifyCategory(catId, dto);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "修改商品分类失败");
        }
        return Result.success();
    }

    /**
     * 添加商品分类
     *
     * @param dto 添加商品分类对象
     * @return
     */
    @PostMapping("")
    public Result addCategory(@RequestBody @Validated AddCategoryDTO dto) {
        boolean result = categoryService.addCategory(dto);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "新增商品分类失败");
        }
        return Result.success();
    }

    @PostMapping("shift")
    public Result transferCategory(@RequestBody TransferCategoryDTO dto) {
        boolean result = categoryService.transferCategory(dto);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "转移商品分类失败");
        }
        return Result.success();
    }
}

