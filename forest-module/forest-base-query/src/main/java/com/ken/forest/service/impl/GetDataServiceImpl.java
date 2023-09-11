package com.ken.forest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ken.forest.mapper.localMysql.localMysqlMapper;
import com.ken.forest.model.entity.BackTest;
import com.ken.forest.service.GetDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GetDataServiceImpl extends ServiceImpl<localMysqlMapper, BackTest> implements GetDataService {


    @Resource
    private  localMysqlMapper localMysqlMapper;

    @Override
    public BackTest doSomeThing() {
        BackTest backTest = localMysqlMapper.selectById(165100);
        return backTest;

    }
}
