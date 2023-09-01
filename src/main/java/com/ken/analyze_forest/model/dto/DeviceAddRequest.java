package com.ken.analyze_forest.model.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class DeviceAddRequest implements Serializable {

    @Size(max= 255,message="编码长度不能超过255")
    private String treeId;

    @Size(max= 255,message="编码长度不能超过255")
    private String entityId;

    @Size(max= 255,message="编码长度不能超过255")
    private String deviceName;

    private Integer DR;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
