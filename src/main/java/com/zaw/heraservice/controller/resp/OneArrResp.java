package com.zaw.heraservice.controller.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhangaiwen
 */
@ApiModel("一维数组动态和相应")
@Data
public class OneArrResp {

    @ApiModelProperty(value = "一维数组")
    private Integer[] intArr;
}
