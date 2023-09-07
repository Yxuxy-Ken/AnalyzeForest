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
    public Device adm(long id) throws Exception {

//        if (id <= 0) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR);
//        }
//        Dict dict = dictService.getById(id);
//        return ResultUtils.success(dict);

        if(id<=0)
        {
            throw new Exception("id错误");
        }

        return getTreeService.getById(id);
    }

}
