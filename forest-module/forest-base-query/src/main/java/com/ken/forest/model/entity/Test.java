package com.ken.forest.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import java.io.Serializable;

@Data
@TableName("TEST")
public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String sn;
}
