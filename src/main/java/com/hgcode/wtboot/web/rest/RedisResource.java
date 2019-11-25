package com.hgcode.wtboot.web.rest;

import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/redis")
public class RedisResource {

    @Resource
    private RedissonClient redissonClient;

    @GetMapping("/get")
    public void bitmap() {
        RBucket<String> rBucket = redissonClient.getBucket("abc");
        rBucket.set("245", 10, TimeUnit.MINUTES);
        System.out.println(rBucket.get());
    }

}
