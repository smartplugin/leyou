package com.leyou.common.base;

import com.leyou.common.springboot.annotation.Interceptor;

import java.io.Serializable;

/**
 * @author chendong
 * @date 2018-07-11
 * @description 统一的结果返回类
 */
public class Result implements Serializable {

    /**  */
    private static final long serialVersionUID = 1L;

    /**
     * 状态码
     */
    private String code;
    /**
     * 状态描述
     */
    private String message;
    /**
     * 业务数据
     */
    private Object data;

    /**
     * 用户自定义返回错误状态码: -1
     */
    public static String ERROR_CODE = "-1";
    /**
     * 操作成功状态码: 200
     */
    public static String SUCCESS_CODE = "200";
    private String SUCCESS_MSG = "操作成功";

    /**
     * 构造方法
     */
    public Result() {
        super();
        this.code = SUCCESS_CODE;
        this.message = SUCCESS_MSG;
    }

    public Result(Object data) {
        super();
        this.code = SUCCESS_CODE;
        this.data = data;
    }

    /**
     * 构造方法
     *
     * @param code    状态码
     * @param message 状态描述
     */
    public Result(String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    /**
     * 构造方法
     *
     * @param code    状态码
     * @param message 状态描述
     * @param data    业务数据
     */
    public Result(String code, String message, Object data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }


    /**
     * 状态码
     */
    public String getCode() {
        return code;
    }

    /**
     * 状态码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 状态描述
     */
    public String getMessage() {
        return message;
    }

    /**
     * 状态描述
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 业务数据
     */
    public Object getData() {
        return data;
    }

    /**
     * 业务数据
     */
    public void setData(Object data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return SUCCESS_CODE.equals(code);
    }


}
