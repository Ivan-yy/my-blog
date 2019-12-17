package com.yy.myblog.common.entity;
import com.yy.myblog.common.constant.ResultCodeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Ivan yu
 * @date 2019/12/17
 */
@Data
public class Response<T> implements Serializable {


    private String retCode;

    private String retMsg;

    private T body;

    /**
     * ***************静态方法*******************
     */
    /**
     *
     * 成功
     * @param <T> 返回值类型
     * @return {@link Response}
     */
    public static <T> Response<T> ok() {
        return ok(null);
    }

    public static <T> Response<T> ok(T body) {
        return ok(body, "ok");
    }

    public static <T> Response<T> ok(T body, String msg) {
        return result(body, ResultCodeEnum.CODE_200.code(), msg);
    }

    /**
     * 失败
     * @param <T> 返回值类型
     * @return {@link Response}
     */
    public static <T> Response<T> error() {
        return error("error");
    }

    public static <T> Response<T> error(String msg) {
        return result(ResultCodeEnum.CODE_500.code(), msg);
    }

    public static <T> Response<T> error(Class<T> clazz, String msg) {
        return result(ResultCodeEnum.CODE_500.code(), msg);
    }

    /**
     *
     * @param <T> 返回泛型
     * @param body 主体
     * @param retCode 返回码
     * @param retMsg 返回信息
     * @return {@link Response}
     */
    public static <T> Response<T> result(T body, String retCode, String retMsg) {
        Response<T> apiResult = new Response<>();
        apiResult.setBody(body);
        apiResult.setRetCode(retCode);
        apiResult.setRetMsg(retMsg);
        return apiResult;
    }

    private void setBody(T body) {
        this.body = body;
    }
    private void setRetCode(String retCode){
        this.retCode = retCode;
    }
    private void setRetMsg(String retMsg){
        this.retMsg = retMsg;
    }

    public static <T> Response<T> result(String code, String msg) {
        return result(null, code, msg);
    }
}
