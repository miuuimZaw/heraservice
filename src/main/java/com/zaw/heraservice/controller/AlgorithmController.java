package com.zaw.heraservice.controller;

import com.zaw.heraservice.controller.req.OneArrReq;
import com.zaw.heraservice.controller.resp.OneArrResp;
import com.zaw.heraservice.controller.resp.RespResult;
import com.zaw.heraservice.service.IAlgorithmService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * 算法控制器
 *
 * @author zhangaiwen
 */
@Api(value = "算法接口",tags = "系列算法接口")
@RestController
@RequestMapping("/algorithm")
public class AlgorithmController {

    @Resource
    private IAlgorithmService algorithmService;

//    @ApiOperation(value = "一维数组动态和", notes = "一维数组动态和")
//    @GetMapping("/getArrSum")
//    public RespResult<OneArrResp> getArrSum(@RequestBody OneArrReq req){
//        return RespResult.success(algorithmService.getSum(req.getIntArr()));
//    }
}
