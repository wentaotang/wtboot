package com.hgcode.wtboot.web.rest;

import com.hgcode.wtboot.domain.UserDO;
import com.hgcode.wtboot.mq.producer.DefaultStreamMqProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.Instant;

@RestController
@RequestMapping("/mq")
public class MqResource {

    @Resource
    private DefaultStreamMqProducer produceConfiguration;

    @GetMapping("/send")
    public void string() throws Exception {
        UserDO userDO = new UserDO();
        userDO.setName("wentao");
        userDO.setUserpwd("124");
        userDO.setId(1024L);
        userDO.setCreatedDate(Instant.now());
        userDO.setLastModifiedDate(Instant.now());
       // produceConfiguration.send(JSON.toJSONString(userDO));
        produceConfiguration.sendWithTag(userDO,"tagTest");
    }



}
