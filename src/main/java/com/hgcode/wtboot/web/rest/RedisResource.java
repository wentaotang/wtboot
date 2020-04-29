package com.hgcode.wtboot.web.rest;

import com.hgcode.wtboot.service.dto.OrderDTO;
import org.redisson.api.*;
import org.redisson.client.codec.LongCodec;
import org.redisson.client.codec.StringCodec;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
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

        rBitSet.set(2324234234242342L,true);
        rBitSet.set(23234324234242342L,true);
        rBitSet.set(232424234L,true);

        System.out.println(rBitSet.size());
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

    @GetMapping("/bucket")
    public ZonedDateTime bucket() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setEnd(ZonedDateTime.now().plusDays(1L));
        orderDTO.setStart(ZonedDateTime.now());
        RBucket<OrderDTO>  rBucket= redissonClient.getBucket("cache");
        rBucket.set(orderDTO,1,TimeUnit.DAYS);
        OrderDTO cache = rBucket.get();
        return cache.getEnd();
    }


    @GetMapping("/Hyperloglog")
    public void Hyperloglog() {
        RSet<Long>  rHyperLogLog= redissonClient.getSet("cache");

        rHyperLogLog.add(34234234234234234L);
        rHyperLogLog.add(34234234234234234L);

        rHyperLogLog.add(44234234234234234L);

        rHyperLogLog.add(54234234234234234L);

        System.out.println(rHyperLogLog.size());


    }

}
