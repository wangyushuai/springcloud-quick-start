package com.example.springcloud.util.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.Date;

/**
 * REST请求响应工具类
 * @author wangyushuai@fang.com
 * @date 2018/9/26
 */
public class RestResponse implements Serializable {

    private final static long serialVersionUID = 1L;

    /**
     * API 状态
     */
    private Integer status;
    //@JsonInclude(JsonInclude.Include.NON_NULL)//不为空时,返回
    /**
     * API 数据
     */
    private Object data;

    /**
     * 附加提示信息
     */
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
    private Long time;

    /**
     * 构造函数
     * @param code
     * @param message
     * @param data
     */
    public RestResponse(int code, String message, Object data) {
        super();
        this.status = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 默认构造函数
     * 防止反序列化报错
     */
    public RestResponse() {
    }

    /**
     * 请求成功
     * @param data
     * @return
     */
    public static RestResponse buildSuccess(Object data) {
        return new RestResponse(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), data);
    }


    /**
     * 代码错误
     * @param data
     * @return
     */
    public static RestResponse buildError_InternalServerError(Object data) {
        return new RestResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), data);
    }

    /**
     * 服务不可用状态嘛
     * 返回错误码（服务不可用时，返回此方法），但推荐直接使用异常类
     * @param data
     * @return
     */
    public static RestResponse buildError_ServiceUnavailable(Object data) {
        return new RestResponse(HttpStatus.SERVICE_UNAVAILABLE.value(), HttpStatus.SERVICE_UNAVAILABLE.getReasonPhrase(), data);
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

}
