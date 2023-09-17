package com.ken.forest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ken.forest.model.entity.Test;

public interface GetTestService extends IService<Test> {
    Test getData(String id);
}
