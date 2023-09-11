package com.ken.forest.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TEST")
public class BackTest implements Serializable {

    private String sn;

    private String id;
}
