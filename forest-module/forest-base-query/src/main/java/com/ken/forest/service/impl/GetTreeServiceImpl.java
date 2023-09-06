package com.ken.forest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ken.forest.mapper.DeviceMapper;
import com.ken.forest.model.entity.Device;
import com.ken.forest.service.GetTreeService;
import org.springframework.stereotype.Service;

@Service
public class GetTreeServiceImpl extends ServiceImpl<DeviceMapper, Device> implements GetTreeService {

}
