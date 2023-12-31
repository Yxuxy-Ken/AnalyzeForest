package com.ken.forest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ken.forest.model.entity.Device;

public interface GetDataService extends IService<Device> {

    Device getDevice(String deviceId);
}
