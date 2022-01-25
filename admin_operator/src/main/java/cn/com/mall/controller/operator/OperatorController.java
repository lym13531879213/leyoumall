package cn.com.mall.controller.operator;

import cn.com.mall.common.QiNiuParam;
import cn.com.mall.common.Result;
import cn.com.mall.common.ResultCode;
import cn.com.mall.common.enums.StatusEnum;
import cn.com.mall.controller.BaseController;
import cn.com.mall.entity.OperateUser;
import cn.com.mall.pojo.dto.operator.LoginDTO;
import cn.com.mall.pojo.dto.operator.ModifyOperatorDTO;
import cn.com.mall.pojo.vo.operator.OperatorInfoVO;
import cn.com.mall.service.OperateUserService;
import cn.com.mall.utils.AssertUtil;
import cn.com.mall.utils.QiNiuUtil;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author liaoyuming
 * @date 2022/1/3 11:14
 */
@RestController
public class OperatorController extends BaseController {

    @Autowired
    private OperateUserService operateUserService;

    @PostMapping("/login")
    public Result<String> login(@RequestBody LoginDTO loginDTO) {
        String username = loginDTO.getUsername();
        String password = loginDTO.getPassword();
        String token = operateUserService.login(username, password);
        return Result.success(token, "登录成功");
    }

    @PostMapping("/register")
    public Result createOperator(@RequestBody OperateUser operateUser) {
        DecodedJWT token = super.getToken();
        long operatorId = Long.parseLong(token.getClaim("operatorId").asString());
        boolean result = operateUserService.createOperator(operatorId, operateUser);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "新增运营用户失败!");
        }
        return Result.success();
    }

    /**
     * @return 获取当前登录用户的基本信息
     */
    @GetMapping("/info")
    public Result<OperatorInfoVO> getInfo() {
        DecodedJWT token = super.getToken();
        long operatorId = Long.parseLong(token.getClaim("operatorId").asString());
        //通过id获取用户信息
        OperateUser user = operateUserService.getById(operatorId);
        return Result.success(OperatorInfoVO.builder().username(user.getUsername())
                .userId(user.getUserId())
                .headImg(user.getHeadImg())
                .build());
    }

    /**
     * 七牛云获取上传凭证
     *
     * @param fileExt 文件后缀
     * @return
     */
    @GetMapping("upload")
    public Result<QiNiuParam> getUploadInfo(String fileExt) {
        return Result.success(QiNiuUtil.generateParam(fileExt));
    }

    /**
     * @param pageNo   页号
     * @param pageSize 页面大小
     * @param realName 真实姓名
     * @param mobile   手机号
     * @param status   是否显示 状态  0：禁用   1：正常
     * @return 用户分页信息
     */
    @GetMapping("page")
    public Result<PageInfo<OperateUser>> getPage(Integer pageNo, Integer pageSize, Long operatorId, String realName, String mobile, Integer status) {
        Object page = super.getPage();
        List<OperateUser> operateUsers = operateUserService.getPage(page, operatorId, realName, mobile, status);
        PageInfo<OperateUser> operateUserPageInfo = new PageInfo<>(operateUsers);
        return Result.success(operateUserPageInfo);
    }

    @PutMapping("{operatorId}/status/{status}")
    public Result switchStatus(@PathVariable Long operatorId, @PathVariable Integer status) {
        AssertUtil.isTrue(StatusEnum.STATUS_YES.getStatus().equals(status) ||
                StatusEnum.STATUS_NO.getStatus().equals(status), "请正确传递参数");
        boolean result = operateUserService.switchStatus(operatorId, status);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "切换启用状态失败");
        }
        return Result.success();
    }

    @DeleteMapping("{operatorId}")
    public Result deleteOperator(@PathVariable Long operatorId) {
        boolean result = operateUserService.deleteUser(operatorId);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "删除用户失败");
        }
        return Result.success();
    }

    @PutMapping("{operatorId}")
    public Result modifyOperator(@PathVariable Long operatorId, @RequestBody @Validated ModifyOperatorDTO dto) {
        boolean result = operateUserService.modifyOperator(operatorId, dto);
        if (!result) {
            return Result.failure(ResultCode.FAIL, "修改用户失败");
        }
        return Result.success();
    }

    @GetMapping("{operatorId}")
    public Result<OperateUser> getOperateUserById(@PathVariable Long operatorId){
        return Result.success(operateUserService.getById(operatorId));
    }
}
