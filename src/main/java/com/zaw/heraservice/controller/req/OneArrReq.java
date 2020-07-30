package com.zaw.heraservice.controller.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhangaiwen
 */
@ApiModel("一维数组动态和请求")
@Data
public class OneArrReq {

    @ApiModelProperty(value = "一维数组")
    private int[] intArr;
}
