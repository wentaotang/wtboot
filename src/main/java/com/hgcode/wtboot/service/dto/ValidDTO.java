package com.hgcode.wtboot.service.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

@Data
public class ValidDTO {

    @NotEmpty(message = "姓名不能为空")
    @Length(min = 1,max = 30, message = "长度最长30个字")
    private String  name;


    @NotEmpty(message = "手机号码不能为空")
    @Length(min = 1,max = 15, message = "长度最长15个字")
    private String phone;


}
