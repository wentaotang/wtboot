package com.hgcode.wtboot.web.rest;

import org.redisson.api.RBitSet;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
