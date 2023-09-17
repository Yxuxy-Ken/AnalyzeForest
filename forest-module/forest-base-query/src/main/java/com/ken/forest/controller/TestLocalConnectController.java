package com.ken.forest.controller;

import com.ken.forest.model.entity.Device;
import com.ken.forest.model.entity.Test;
import com.ken.forest.service.GetDataService;
import com.ken.forest.service.GetTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/device")
@RestController
public class TestLocalConnectController {

    @Autowired
    private GetTestService getTestService;

    @Resource
    private GetDataService getDataService;


    @GetMapping("/test1")
    public Device test1(String id) {
        return getDataService.getDevice(id);
    }

    @GetMapping("/test2")
    public Test test2(String  id) {
        return getTestService.getData(id);
    }

}
