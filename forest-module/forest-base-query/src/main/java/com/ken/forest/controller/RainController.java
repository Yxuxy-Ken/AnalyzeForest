package com.ken.forest.controller;

import com.ken.base.baseResponse.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pia")
public class RainController {

    @GetMapping("/cont1")
    public int testController(){
        int a =10;
        return a;
    }

    @GetMapping("/cont2")
    public Result test2(){
       return Result.error("?");
    }


}
