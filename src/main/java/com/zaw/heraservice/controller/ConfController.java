package com.zaw.heraservice.controller;

import com.zaw.heraservice.bo.AppPropertiesBO;
import com.zaw.heraservice.controller.resp.RespResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.stream.Collectors;

/**
 * @author zhangaiwen
 */
@Log4j2
@Api(tags = {"配置接口"})
@RestController
@RequestMapping("conf/")
public class ConfController {

    @Resource
    private AppPropertiesBO propBO;

    @ApiOperation("读取YML数据")
    @GetMapping("readYml")
    public RespResult getYamlProp() {
        log.info("read yml file... \n str:{} \n escapeStr:{} \n specialStr:{} \n bol:{} \n intValue:{} \n dolValue:{}",
                propBO.getStr(), propBO.getEscapeStr(), propBO.getSpecialStr(), propBO.getBol(), propBO.getIntValue(), propBO.getDolValue());
        log.info("\n objList:{} \n objSet:{} \n objMap:{}",
                String.join(",", propBO.getObjList()),
                propBO.getObjSet().stream().map(String::valueOf).collect(Collectors.joining(",")),
                propBO.getObjMap().keySet().stream().map(k -> k + ":" + propBO.getObjMap().get(k)).collect(Collectors.joining(";"))
        );
        return RespResult.success();
    }
}
