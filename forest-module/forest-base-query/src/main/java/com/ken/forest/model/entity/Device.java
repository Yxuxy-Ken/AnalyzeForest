package com.ken.forest.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName(value = "devices")
public class Device implements Serializable {
    private static final long serialVersionUID = -74041961083716004L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String devicename;

    private String treeid;

    private String entityid;

}
