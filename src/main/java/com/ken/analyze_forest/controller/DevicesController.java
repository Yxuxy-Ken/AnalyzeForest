package com.ken.analyze_forest.controller;

import com.ken.analyze_forest.common.BaseResponse;
import com.ken.analyze_forest.common.ResultUtils;
import org.springframework.web.bind.annotation.*;

/**
 * 测试表(Devices)表控制层
 *
 * @author makejava
 * @since 2023-09-01 10:48:49
 */
@RestController
@RequestMapping("/devices")
public class DevicesController {

    @GetMapping("/test")
    public BaseResponse<Integer> getById(Integer id){
        return ResultUtils.success(1);
    }

}

