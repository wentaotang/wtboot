package com.hgcode.wtboot.web.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hgcode.wtboot.service.dto.OrderDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.ZonedDateTime;

@RestController
@RequestMapping("/api/jackson")
public class JacksonResource {

    @Resource
    private ObjectMapper objectMapper;


    @GetMapping("/serialize")
    public String serialize() throws JsonProcessingException {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setStart(ZonedDateTime.now().plusDays(-3));
        orderDTO.setEnd(ZonedDateTime.now().plusDays(3));
        return objectMapper.writeValueAsString(orderDTO);
    }

    @GetMapping("/deserialize")
    public OrderDTO deserialize() throws JsonProcessingException {
        return objectMapper.readValue("{\"start\":\"2020-05-06 11:58:30\",\"end\":\"2020-05-12 11:58:30\"}",OrderDTO.class);
    }
}
