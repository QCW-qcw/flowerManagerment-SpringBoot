package com.qcw.flowermanagerment.Config;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
public class Result<T>  implements Serializable {

    private Boolean success;

    private String message;

    private T data;

    public Result() {
    }

    public Result(Boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public static <T> Result success(T data){
        return new Result(true , "请求成功" , data);
    }

    public static <T> Result success(String message ,T data){
        return new Result(true , message , data);
    }


    public static Result fail(String message){
        return new Result(false , message , null);
    }


    public static <T> Result fail(String message ,T data){
        return new Result(false , message , data);
    }
}