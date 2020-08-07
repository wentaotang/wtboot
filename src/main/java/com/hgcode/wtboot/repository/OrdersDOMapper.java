package com.hgcode.wtboot.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hgcode.wtboot.domain.OrdersDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrdersDOMapper extends BaseMapper<OrdersDO> {

    void batchInsert(List<OrdersDO> list);

    void updateXml(OrdersDO ordersDO);

}
