package com.bytehonor.sdk.framework.spring.response;

import java.io.Serializable;

import com.bytehonor.sdk.framework.spring.code.StandardCode;
import com.bytehonor.sdk.framework.spring.exception.ResponseException;

/**
 * Json Response
 * 
 * @author lijianqiang
 *
 * @param <T>
 */
public final class JsonResponse<T> implements Serializable {

    private static final long serialVersionUID = 2464992888381774481L;

    private Integer code;

    private String message;

    private T data;

    public static JsonResponse<DataString> ok(String data) {
        return success(DataString.of(data));
    }

    public static JsonResponse<DataInteger> ok(Integer data) {
        return success(DataInteger.of(data));
    }

    public static JsonResponse<DataLong> ok(Long data) {
        return success(DataLong.of(data));
    }

    public static JsonResponse<DataBoolean> ok(Boolean data) {
        return success(DataBoolean.of(data));
    }

    public static <R> JsonResponse<R> build(int code, String message, R data) {
        JsonResponse<R> result = new JsonResponse<R>();
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static <R> JsonResponse<R> success(R data) {
        return build(StandardCode.OK, StandardCode.SUCCESS, data);
    }

    public static <R> JsonResponse<R> error(int code, String message) {
        return build(code, message, null);
    }

    public static <T> T safeGet(JsonResponse<T> response) {
        if (response == null) {
            throw new ResponseException("RESPONSE NULL");
        }
        if (response.getCode() != StandardCode.OK) {
            throw new ResponseException(response.toString());
        }
        T data = response.getData();
        if (data == null) {
            throw new ResponseException("RESPONSE BODY NULL");
        }
        return data;
    }

    public static String dataString(JsonResponse<DataString> response) {
        DataString ds = safeGet(response);
        return ds.getResult();
    }

    public static Long dataLong(JsonResponse<DataLong> response) {
        DataLong data = safeGet(response);
        return data.getResult();
    }

    public static Integer dataInteger(JsonResponse<DataInteger> response) {
        DataInteger data = safeGet(response);
        return data.getResult();
    }

    public static Boolean dataBoolean(JsonResponse<DataBoolean> response) {
        DataBoolean data = safeGet(response);
        return data.getResult();
    }

    public static <T> boolean isError(JsonResponse<T> response) {
        if (response == null) {
            return true;
        }
        return response.getCode() != StandardCode.OK;
    }

    public static <S> JsonResponse<S> fallback() {
        return fallback(null);
    }

    public static <S> JsonResponse<S> fallback(S data) {
        JsonResponse<S> result = new JsonResponse<S>();
        result.setCode(StandardCode.FEIGN_FALLBACK);
        result.setMessage("远程服务不可用");
        result.setData(data);
        return result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[code:").append(this.code).append(", message:").append(this.message).append("]");
        return sb.toString();
    }

}
