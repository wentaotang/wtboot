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
        for (int i = 0; i < 100; i++) {
            OrdersDO ordersDO = new OrdersDO();
            ordersDO.setUserId(1L);
            list.add(ordersDO);
        }
        ordersService.saveBatch(list);
    }

    @RequestMapping("/batchupdate")
    public void batchUpdate() {

        List<Long> ids = new ArrayList<>();
        ids.add(1255854707751018497L);
        ids.add(1255854707990093826L);
        ids.add(1255854707977510915L);

        Collection<OrdersDO> list =  ordersService.listByIds(ids);
        for(OrdersDO ordersDO : list){
            ordersDO.setUserId(6L);
        }
        ordersService.updateBatchById(list);
    }
}
