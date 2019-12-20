package com.hgcode.wtboot.web.rest;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.hgcode.wtboot.domain.OrdersDO;
import com.hgcode.wtboot.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/sharding")
public class SharingResource {

    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/init")
    public void list() {

        List<OrdersDO> list = new ArrayList<>(100);
        Snowflake snowflake = IdUtil.createSnowflake(1, 1);
        for (int i = 0; i < 100; i++) {
            OrdersDO ordersDO = new OrdersDO();
            ordersDO.setUserId(snowflake.nextId());
            ordersDO.setId(snowflake.nextId());
            list.add(ordersDO);
        }
        ordersService.saveBatch(list);
    }

    @RequestMapping("/batchupdate")
    public void batchUpdate() {

        List<Long> ids = new ArrayList<>();
        ids.add(1207932619879223363L);
        ids.add(1207932619879223371L);
        ids.add(1207932619879223379L);
        ids.add(1207932619879223387L);
        ids.add(1207932619879223395L);

        Collection<OrdersDO> list =  ordersService.listByIds(ids);
        for(OrdersDO ordersDO : list){
            ordersDO.setUserId(6L);
        }
        ordersService.updateBatchById(list);
    }
}
