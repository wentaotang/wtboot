package com.hgcode.wtboot.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.time.LocalDateTime;

/**
* @desc：所有实体类的基类，所有的DO都应该继承此类
* @author：wentao_tang
* @date：2022/3/27 14:03
**/
public class BaseDO {
    /**
     * 创建人
     */
    @TableField(value = "created_by")
    private String createdBy;
    /**
     * 创建时间
     */
    @TableField(value = "created_time",fill = FieldFill.INSERT)
    private LocalDateTime createdTime;
    /**
     * 修改人
     */
    @TableField(value = "updated_by")
    private String updateBy;
    /**
     * 修改时间
     */
    @TableField(value = "updated_time",fill = FieldFill.UPDATE)
    private LocalDateTime updateTime ;


    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}
