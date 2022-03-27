package com.hgcode.wtboot.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "createdBy", ()->"system-insert",String.class);
        this.strictInsertFill(metaObject, "createdTime",()-> LocalDateTime.now(),LocalDateTime.class);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "updateBy",()->"system-update", String.class);
        this.strictUpdateFill(metaObject, "updateTime",()-> LocalDateTime.now(),LocalDateTime.class);
    }
}
