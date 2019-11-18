package com.hgcode.wtboot.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {
        //避免使用metaObject.setValue()
        this.setFieldValByName("createdBy", "add_user", metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        //避免使用metaObject.setValue()
        this.setFieldValByName("lastModifiedBy", "update_user", metaObject);
    }
}
