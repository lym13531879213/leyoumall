package cn.com.mall.api.handler;

import cn.com.mall.common.Result;
import cn.com.mall.common.ResultCode;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author liaoyuming
 * @date 2022/1/3 11:42
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理运行时异常
     * @param e
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Result processBusinessException(RuntimeException e){
        return Result.failure(ResultCode.FAIL,e.getMessage());
    }

    /**
     * 处理validation失败的异常
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result exceptionHandler(MethodArgumentNotValidException e) {
        return Result.failure(ResultCode.FAIL, e.getBindingResult().getFieldError().getDefaultMessage());
    }
}
