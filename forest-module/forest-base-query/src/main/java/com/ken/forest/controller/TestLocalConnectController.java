package com.ken.forest.controller;

import com.ken.forest.model.entity.Device;
import com.ken.forest.service.GetTreeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/device")
@RestController
public class TestLocalConnectController {

    @Resource
    private GetTreeService getTreeService;


    @GetMapping("/getTree")
    public Device adm() {
        System.out.println("123");
        return getTreeService.getById(1);
    }

}
