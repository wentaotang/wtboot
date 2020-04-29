package com.hgcode.wtboot.mq.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MySink {

    @Input("input5")
    SubscribableChannel order();
}
