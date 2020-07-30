package com.zaw.heraservice.controller.resp;

import io.micrometer.core.instrument.util.StringUtils;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class RespResult<T> {

    private Integer code;

    private String msg;

    private T data;

    public static <T> RespResult success(T t) {
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
