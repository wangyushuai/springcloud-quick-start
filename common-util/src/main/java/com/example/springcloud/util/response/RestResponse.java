package com.example.springcloud.util.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author wangyushuai@fang.com
 * @date 2018/9/26
 * REST请求响应工具类
 */
public class RestResponse implements Serializable {

    private final static long serialVersionUID = 1L;
    /**
     * 成功
     */
    private final static int STATUS_SUCCESS = 200;

    /**
     * 代码错误
     */
    private final static int STATUS_ERROR_INTERNAL_SERVER_ERROR = 500;

    /**
     * 服务不可用（针对熔断&服务降级的情况）
     */
    private final static int STATUS_ERROR_SERVICE_UNAVAILIABLE = 503;


    private int status;
    //@JsonInclude(JsonInclude.Include.NON_NULL)//不为空时,返回
    private Object data;
    private String message;

    /**
     * 时间戳并格式化
     */
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",locale = "lz",timezone = "GMT+8")
    private Date timestamp;

    /**
     * 程序耗时
     */
    //@JsonIgnore//不返回注解
    private long time;

    public RestResponse(int code, String message, Object data) {
        super();
        this.status = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 请求成功
     * @param data
     * @return
     */
    public static RestResponse buildSuccess(Object data) {
        return new RestResponse(STATUS_SUCCESS, "success", data);
    }


    /**
     * 代码错误
     * @param data
     * @return
     */
    public static RestResponse buildError_InternalServerError(Object data) {
        return new RestResponse(STATUS_ERROR_INTERNAL_SERVER_ERROR, "error", data);
    }

    /**
     * 返回错误码（服务不可用时，返回此方法），但推荐直接使用异常类
     * @param data
     * @return
     */
    public static RestResponse buildError_ServiceUnavailable(Object data) {
        return new RestResponse(STATUS_ERROR_SERVICE_UNAVAILIABLE, "error", data);
    }

//    public static RestResponse buildError(Object data) {
//        return new RestResponse(STATUS_SUCCESS, "success", data);
//    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return new Date();
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getTime() {
        return time + "ms";
    }

    public void setTime(long time) {
        this.time = time;
    }

}
