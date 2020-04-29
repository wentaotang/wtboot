package com.hgcode.wtboot.mq.producer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MySource {

    @Output("order")
    MessageChannel order();
}
