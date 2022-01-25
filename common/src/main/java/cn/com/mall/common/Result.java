package cn.com.mall.common;

import lombok.Data;
import java.io.Serializable;


@Data
public class Result<T> implements Serializable {

    private Integer code;

    private String message;

    private T data;


    public Result(ResultCode resultCode, T data) {
        this.code = resultCode.code();
        this.message=resultCode.message();
        this.data=data;
    }

    public Result(ResultCode resultCode) {
        this.code = resultCode.code();
        this.message=resultCode.message();
    }

    public static <T> Result<T> success(){
        return  new Result<>(ResultCode.SUCCESS);
    }
    public static <T> Result<T> success(T data){
        Result<T> result=new Result<T>(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }
    public static <T> Result<T> success(T data,String message){
        Result<T> result=new Result<T>(ResultCode.SUCCESS);
        result.setCode(200);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> failure(ResultCode resultCode){
        return new Result<>(resultCode);
    }

    public static <T> Result<T>  failure(ResultCode resultCode,T data){
        Result<T> result=new Result<T>(resultCode);
        result.setData(data);
        return result;
    }
    public static <T> Result<T> failure(ResultCode resultCode,String message){
        Result<T> result=new Result<T>(resultCode);
        result.setMessage(message);
        return result;
    }
}
