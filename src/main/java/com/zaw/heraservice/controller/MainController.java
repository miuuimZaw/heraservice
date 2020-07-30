package com.zaw.heraservice.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author zhangaiwen
 */
@Api(value = "初始接口", tags = "初始简单接口")
@RestController
@RequestMapping("hello/")
public class MainController {

    @ApiResponses({@ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @ApiOperation(value = "测试接口1", notes = "获取后台字段", responseContainer = "String", response = String.class)
    @GetMapping("test")
    public String test() {
        return "hello ";
    }



}
