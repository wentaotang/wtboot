package com.hgcode.wtboot.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

/**
 * @desc：用户表
 * @author：wentao_tang
 * @date：2022/3/27 14:20
 **/
@TableName(value = "member")
@Data
@Builder
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

}
