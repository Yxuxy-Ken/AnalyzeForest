package com.ken.forest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ken.forest.mapper.localMysql.localMysqlMapper;
import com.ken.forest.model.entity.Device;
import com.ken.forest.service.GetDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GetDataServiceImpl extends ServiceImpl<localMysqlMapper, Device> implements GetDataService {

    @Resource
    private localMysqlMapper localMysqlMapper;

    public Device getDevice(String deviceId) {
        return localMysqlMapper.selectById(deviceId);
    }
}
