package com.zaw.heraservice.controller.resp;

import io.micrometer.core.instrument.util.StringUtils;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * 基础响应
 *
 * @author zhangaiwen
 */
@Data
@NoArgsConstructor
public class RespResult<T> {

    private Integer code = 200;

    private String msg = "success";

    private T data;

    public RespResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static <T> RespResult<T> error(String msg) {
        return new RespResult(-1, msg);
    }

    public static <T> RespResult<T> error(String msg, T t) {
        RespResult<T> result = new RespResult(-1, msg);
        result.setData(t);
        return result;
    }

    public static <T> RespResult<T> error(Integer code, String msg, T t) {
        RespResult<T> result = new RespResult(-1, msg);
        result.setData(t);
        return result;
    }

    public static <T> RespResult<T> success() {
        return success("", null);
    }

    public static <T> RespResult<T> success(T t) {
        return success((String) null, t);
    }

    public static <T> RespResult<T> success(String msg, T t) {
        RespResult<T> result = new RespResult();
        if (StringUtils.isNotBlank(msg)) {
            result.setMsg(msg);
            result.setCode(200);
        }

        if (Objects.nonNull(t)) {
            result.setData(t);
        }
        return result;
    }
}
