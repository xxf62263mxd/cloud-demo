package com.peck.cloud.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private static final Integer SUCCESS_CODE = 200;
    private static final Integer FAIL_CODE = 404;

    private Integer code;
    private String message;
    private T data;


    public static <T> CommonResult<T> success(String message,T data){
        return new CommonResult<>(SUCCESS_CODE,message,data);
    }

    public static <T> CommonResult<T> fail(String message,T data){
        return new CommonResult<>(FAIL_CODE,message,data);
    }


}
