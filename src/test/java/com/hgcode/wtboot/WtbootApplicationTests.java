package com.hgcode.wtboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

//@SpringBootTest
class WtbootApplicationTests {

    @Test
    void contextLoads() {
        double d= 1.5D;
        int assingNums = new BigDecimal("1.6").toBigInteger().intValue();
        System.out.println(assingNums);
    }

}
