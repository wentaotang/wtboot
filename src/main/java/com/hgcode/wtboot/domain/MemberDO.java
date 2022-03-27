package com.hgcode.wtboot.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @desc：用户表
 * @author：wentao_tang
 * @date：2022/3/27 14:20
 **/
@TableName(value = "member")
public class MemberDO extends BaseDO {

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @TableField(value = "name")
    private String name ;

    @TableField(value = "code")
    private String code ;

    @TableField(value = "phone")
    private String phone ;

    @TableField(value = "sex")
    private Integer sex ;

    @TableField(value = "status")
    private Integer status ;

    @TableField(value = "is_deleted")
    private Integer deleted ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}
