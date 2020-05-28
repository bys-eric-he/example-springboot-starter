package com.example.springboot.starter.controller;

import com.demo.springboot.starter.service.DemoStarterService;
import com.example.springboot.starter.common.Result;
import com.example.springboot.starter.common.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;

@Api(tags = "DemoController", description = "Spring Boot Starter Demo")
@RestController
@RequestMapping("/aip/demo")
public class DemoController {

    @Autowired
    private DemoStarterService demoStarterService;

    @GetMapping("/getConfiguration")
    @ApiOperation("getConfiguration")
    public Result<String> getConfiguration() {
        return ResultUtil.success(demoStarterService.getConfiguration());
    }

    @GetMapping("/getConfigurationMap")
    @ApiOperation("getConfigurationMap")
    public Result<ConcurrentHashMap<String, Object>> getConfigurationMap() {
        return ResultUtil.success(demoStarterService.getConfigurationMap());
    }
}
