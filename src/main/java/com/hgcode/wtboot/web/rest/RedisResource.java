package com.hgcode.wtboot.web.rest;

import org.redisson.api.*;
import org.redisson.client.codec.StringCodec;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/redis")
public class RedisResource {

    @Resource
    private RedissonClient redissonClient;

    @GetMapping("/get")
    public void string() {
        RBucket<String> rBucket = redissonClient.getBucket("abc");
        rBucket.set("245", 10, TimeUnit.MINUTES);
        System.out.println(rBucket.get());
    }

    /**
     * 签到示例
     */
    @GetMapping("/bit")
    public void bitmap() {
        String key = "abacd";
        RBitSet rBitSet = redissonClient.getBitSet(key);

        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        Long offset = Long.parseLong(localDate.format(formatter));
        rBitSet.set(offset,true);
        localDate=  localDate.plusDays(1L);
        offset = Long.parseLong(localDate.format(formatter));
        rBitSet.set(offset,true);
        rBitSet.set(1L,8L,true);
        rBitSet.and();
        rBitSet.xor();
        System.out.println(rBitSet.cardinality());
    }


    @GetMapping("/map/put")
    public void rmap() {
        RMapCache<String,String> rmap= redissonClient.getMapCache("cache", StringCodec.INSTANCE);
        rmap.put("abc","123",2L,TimeUnit.MINUTES);
        rmap.put("def","456",3L,TimeUnit.MINUTES);
    }

    @GetMapping("/map/delete")
    public void deteletMap(@RequestParam("key")String key) {
        RMap<String,String>  rmap= redissonClient.getMapCache("cache");
        rmap.fastRemove(key);
    }

}
