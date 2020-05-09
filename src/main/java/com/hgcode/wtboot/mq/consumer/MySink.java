package com.hgcode.wtboot.mq.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * 定义消费者端 的binding
 */
public interface MySink {

    @Input("input5")
    SubscribableChannel order();
}
