package com.hgcode.wtboot.mq.consumer;

import com.hgcode.wtboot.mq.producer.MySource;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;

import javax.annotation.Resource;

@Configuration
@EnableBinding({MySink.class})
public class DefaultRocketMQConsumer {

    @StreamListener(value = "input5")
    public void receive(String receiveMsg) {
        System.out.println(receiveMsg);
    }
}
