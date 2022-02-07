package cn.com.mall.operator.controller.pms;

import cn.com.mall.common.Result;
import cn.com.mall.common.ResultCode;
import cn.com.mall.common.enums.AttrTypeEnum;
import cn.com.mall.common.enums.StatusEnum;
import cn.com.mall.entity.PmsAttr;
import cn.com.mall.operator.controller.BaseController;
import cn.com.mall.operator.pojo.dto.pms.AttrDTO;
import cn.com.mall.operator.service.PmsAttrService;
import cn.com.mall.utils.AssertUtil;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author liaoyuming
 * @date 2022/2/6 16:35
 * @Description
 */
@RequestMapping("/goods/attr")
@RestController
@Slf4j
public class AttrController extends BaseController {

    @Autowired
    private PmsAttrService attrService;

    @GetMapping("page")
    public Result<PageInfo<PmsAttr>> getAttrPage(Integer pageNo, Integer pageSize, Long attrId, String attrName, Long catId, Integer searchType, Integer attrType, Integer enable) {
        Object page = super.getPage();
        List<PmsAttr> list = attrService.getAttrPage(page, attrId, attrName, catId, searchType, attrType, enable);
        PageInfo<PmsAttr> pmsAttrPageInfo = new PageInfo<>(list);
        return Result.success(pmsAttrPageInfo);
    }

    @GetMapping("{attrId}")
    public Result<PmsAttr> getAttr(@PathVariable Long attrId) {
        return Result.success(attrService.getAttr(attrId));
    }

    @PostMapping("")
    public Result addAttr(@RequestBody AttrDTO dto) {
        boolean result = attrService.addAttr(dto);
        if (!result) {
            if (AttrTypeEnum.SALES_ATTRIBUTES.getType().equals(dto.getAttrType())) {
                return Result.failure(ResultCode.FAIL, "新增销售属性失败");
            } else if (AttrTypeEnum.SPECIFICATION.getType().equals(dto.getAttrType())) {
                return Result.failure(ResultCode.FAIL, "新增规格参数失败");
            }
        }
        return Result.success();
    }

    @DeleteMapping("{attrId}")
    public Result deleteAttr(@PathVariable Long attrId) {
        boolean result = attrService.deleteAttr(attrId);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "删除失败");
        }
        return Result.success();
    }

    @PutMapping("{attrId}")
    public Result putAttr(@PathVariable Long attrId, @RequestBody AttrDTO dto) {
        boolean result = attrService.putAttr(attrId, dto);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "修改失败");
        }
        return Result.success();
    }

    @PutMapping("{attrId}/status/{status}")
    public Result switchStatus(@PathVariable Long attrId, @PathVariable Integer status,@RequestParam Integer type) {
        System.out.println("attrId:"+attrId+",status:"+status+",type:"+type);
        AssertUtil.isTrue(StatusEnum.STATUS_YES.getStatus().equals(status) ||
                StatusEnum.STATUS_NO.getStatus().equals(status), "请正确传递参数");

        boolean result = attrService.switchStatus(attrId, status, type);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "切换失败");
        }
        return Result.success();
    }

}
