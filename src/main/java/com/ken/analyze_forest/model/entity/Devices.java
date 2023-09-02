package com.ken.analyze_forest.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 设备测试表
 * @TableName devices
 */
@TableName(value = "devices")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Devices implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    @Size(max= 255,message="编码长度不能超过255")
    private String treeId;

    @Size(max= 255,message="编码长度不能超过255")
    private String entityId;

    @Size(max= 255,message="编码长度不能超过255")
    private String deviceName;

    private Integer DR;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}
