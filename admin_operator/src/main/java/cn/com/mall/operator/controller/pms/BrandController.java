package cn.com.mall.operator.controller.pms;

import cn.com.mall.common.Result;
import cn.com.mall.common.ResultCode;
import cn.com.mall.common.enums.StatusEnum;
import cn.com.mall.operator.controller.BaseController;
import cn.com.mall.entity.PmsBrand;
import cn.com.mall.operator.pojo.dto.pms.AddBrandDTO;
import cn.com.mall.operator.pojo.dto.pms.ModifyBrandDTO;
import cn.com.mall.operator.service.PmsBrandService;
import cn.com.mall.utils.AssertUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController extends BaseController {

    @Autowired
    private PmsBrandService pmsBrandService;

    @GetMapping("page")
    public Result<PageInfo<PmsBrand>> getPage(Integer pageNo, Integer pageSize, Long brandId, String name, Integer showStatus, String firstLetter) {
        Object page = super.getPage();
        List<PmsBrand> brands = pmsBrandService.getPage(page,brandId,name,showStatus,firstLetter);
        PageInfo<PmsBrand> pmsBrandPageInfo = new PageInfo<>(brands);
        return Result.success(pmsBrandPageInfo);
    }

    @PostMapping("")
    public Result addBrand(@RequestBody @Validated AddBrandDTO dto){
        boolean result = pmsBrandService.addBrand(dto);
        if(!result){
            return Result.failure(ResultCode.FAIL,"新增品牌失败");
        }
        return Result.success();
    }

    @DeleteMapping("/{brandId}")
    public Result deleteBrand(@PathVariable Long brandId){
        boolean result = pmsBrandService.deleteBrand(brandId);
        if(!result){
            return Result.failure(ResultCode.FAIL,"删除品牌失败");
        }
        return Result.success();
    }

    @PutMapping("/{brandId}")
    public Result modifyBrand(@PathVariable Long brandId,@RequestBody @Validated ModifyBrandDTO dto){
        boolean result = pmsBrandService.modifyBrand(brandId,dto);
        if(!result){
            return Result.failure(ResultCode.FAIL,"修改品牌失败");
        }
        return Result.success();
    }

    @GetMapping("/{brandId}")
    public Result getBrandById(@PathVariable Long brandId){
        PmsBrand brand = pmsBrandService.getBrandById(brandId);
        if(brand == null){
            return Result.failure(ResultCode.FAIL,"回显品牌信息失败");
        }
        return Result.success(brand);
    }

    /**
     * 切换显示状态
     *
     * @param showStatus 是否显示[0-不显示，1显示]
     * @return
     */
    @PutMapping("/{brandId}/status/{showStatus}")
    public Result switchStatus(@PathVariable Long brandId, @PathVariable Integer showStatus) {
        AssertUtil.isTrue(StatusEnum.STATUS_YES.getStatus().equals(showStatus) ||
                StatusEnum.STATUS_NO.getStatus().equals(showStatus), "请正确传递参数");
        boolean result = pmsBrandService.switchStatus(brandId, showStatus);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "切换显示状态失败");
        }
        return Result.success();
    }

}
