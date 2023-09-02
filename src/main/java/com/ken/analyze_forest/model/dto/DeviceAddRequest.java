package com.ken.analyze_forest.model.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author Ken
 */
@Data
public class DeviceAddRequest implements Serializable {

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
