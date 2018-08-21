package com.fangj.springcloud.core;

import com.fangj.springcloud.core.commons.exception.core.ExceptionCode;
import com.fangj.springcloud.core.exception.BizException;
import com.fangj.springcloud.core.exception.code.BaseExceptionCode;
import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * @author 自定义应用统一返回格式
 * @createTime 2017-12-13 10:55
 */
public class Result<T> {
    public static final String DEF_ERROR_MESSAGE = "系统繁忙，请稍候再试";
    public static final String HYSTRIX_ERROR_MESSAGE = "请求超时，请稍候再试";
    private static final int SUCCESS = 0;
    private static final int FAIL = -1;

    /**
     * 调用是否成功标识，0：成功，-1:系统繁忙，此时请开发者稍候再试 详情见[ExceptionCode]
     */
    private int errcode;
    
    private int status;
    
    private String text;
    /**
     * 调用结果
     */
    private T data;

    /**
     * 结果消息，如果调用成功，消息通常为空T
     */
    private String errmsg = "ok";

    private Result() {
        super();
    }

    public Result(int errcode, T data, String errmsg,int status,String text) {
        this.errcode = errcode;
        this.data = data;
        this.errmsg = errmsg;
        this.status = status;
        this.text= text;
    }

    /**
     * 请求成功消息
     *
     * @param data 结果
     * @return RPC调用结果
     */
    public static <E> Result<E> success(E data) {
        return new Result<>(SUCCESS, data, "ok",ExceptionCode.SUCCESS.getCode(),ExceptionCode.SUCCESS.name());
    }

    /**
     * 请求成功方法 ，data返回值，msg提示信息
     *
     * @param data 结果
     * @param msg  消息
     * @return RPC调用结果
     */
    public static <E> Result<E> success(E data, String msg) {
        return new Result<>(SUCCESS, data, msg,ExceptionCode.SUCCESS.getCode(),ExceptionCode.SUCCESS.name());
    }

    /**
     * 请求失败消息
     *
     * @param msg
     * @return
     */
    public static <E> Result<E> fail(int code, String msg) {
        return new Result<>(code, null, (msg == null || msg.isEmpty()) ? DEF_ERROR_MESSAGE : msg,ExceptionCode.FALSE.getCode(),ExceptionCode.FALSE.name());
    }

    public static <E> Result<E> fail(String msg) {
        return fail(FAIL, msg);
    }


    public static <E> Result<E> fail(BaseExceptionCode exceptionCode) {
        return new Result<>(exceptionCode.getCode(), null,
                (exceptionCode.getMsg() == null || exceptionCode.getMsg().isEmpty()) ? DEF_ERROR_MESSAGE : exceptionCode.getMsg(),ExceptionCode.FALSE.getCode(),ExceptionCode.FALSE.name());
    }

    public static <E> Result<E> fail(BizException exception) {
        if (exception == null) {
            return fail(DEF_ERROR_MESSAGE);
        }
        return new Result<>(exception.getCode(), null, exception.getMessage(),ExceptionCode.FALSE.getCode(),"发生运行时异常");
    }

    /**
     * 请求失败消息，根据异常类型，获取不同的提供消息
     *
     * @param throwable 异常
     * @return RPC调用结果
     */
    public static <E> Result<E> fail(Throwable throwable) {
        return fail(throwable != null ? throwable.getMessage() : DEF_ERROR_MESSAGE);
    }

    public static <E> Result<E> timeout() {
        return fail(HYSTRIX_ERROR_MESSAGE);
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    /**
     * 逻辑处理是否成功
     *
     * @return 是否成功
     */
    @JsonIgnore
    public boolean isSuccess() {
        return this.errcode == SUCCESS;
    }

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
    
    
}
