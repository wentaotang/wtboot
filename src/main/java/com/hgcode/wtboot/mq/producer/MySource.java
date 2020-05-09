package com.hgcode.wtboot.mq.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 定义binding
 */
public interface MySource {

    @Output("order")
    MessageChannel order();
}
