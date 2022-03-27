package com.hgcode.wtboot.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.time.LocalDateTime;

/**
* @desc：所有实体类的基类，所有的DO都应该继承此类
* @author：wentao_tang
* @date：2022/3/27 14:03
**/
@Data
public class BaseDO {
    /**
     * 创建人
     */
    @TableField(value = "created_by",fill = FieldFill.INSERT)
    private String createdBy;
    /**
     * 创建时间
     */
    @TableField(value = "created_time",fill = FieldFill.INSERT)
    private LocalDateTime createdTime;
    /**
     * 修改人
     */
    @TableField(value = "updated_by",fill = FieldFill.UPDATE)
    private String updateBy;
    /**
     * 修改时间
     */
    @TableField(value = "updated_time",fill = FieldFill.UPDATE)
    private LocalDateTime updateTime ;
}
