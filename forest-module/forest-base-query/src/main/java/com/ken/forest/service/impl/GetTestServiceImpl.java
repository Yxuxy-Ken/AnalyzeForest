package com.ken.forest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ken.forest.mapper.testSqlServer.GetTestMapper;
import com.ken.forest.model.entity.Test;
import com.ken.forest.service.GetTestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GetTestServiceImpl extends ServiceImpl<GetTestMapper, Test> implements GetTestService {
    @Resource
    private GetTestMapper getTestMapper;

    public Test getData(String id){
        return getTestMapper.selectById(id);
    }
}
