package com.hgcode.wtboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hgcode.wtboot.domain.OrdersDO;
import com.hgcode.wtboot.repository.OrdersDOMapper;
import com.hgcode.wtboot.service.OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl extends ServiceImpl<OrdersDOMapper, OrdersDO> implements OrdersService {

    @Resource
    private OrdersDOMapper ordersDOMapper;

    @Override
    public void updateXml(OrdersDO ordersDO) {
        ordersDOMapper.updateXml(ordersDO);
    }
}
