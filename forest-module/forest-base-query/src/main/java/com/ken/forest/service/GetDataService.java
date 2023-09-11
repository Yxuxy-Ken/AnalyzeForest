package com.ken.forest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ken.forest.model.entity.BackTest;

public interface GetDataService extends IService<BackTest> {
    BackTest doSomeThing();
}
