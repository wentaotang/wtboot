package com.hgcode.wtboot.common;

import lombok.Data;
/**
* @desc：Rest 接口层-通用返回结果
* @author：wentao_tang
* @date：2022/3/26 23:00
**/
@Data
public class CommonResult<T> {
    /**
     * 编码
     */
    private Integer code;
    /**
     * 错误消息
     */
    private String message;
    /**
     * 数据
     */
    private T data;
}
