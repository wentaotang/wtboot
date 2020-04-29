package com.hgcode.wtboot.mq.producer;

import org.apache.rocketmq.common.message.MessageConst;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.util.MimeTypeUtils;

import javax.annotation.Resource;

@Configuration
@EnableBinding({MySource.class})
public class DefaultRocketMQProducer {

    @Resource
    private MySource source;

    public <T> void send(T msg) {
        Message message = MessageBuilder.withPayload(msg)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build();
        source.order().send(message);
    }

    public <T> void sendWithTag(T msg,String tag) {
        Message message = MessageBuilder.withPayload(msg)
                .setHeader(MessageConst.PROPERTY_TAGS, tag)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build();
        source.order().send(message);
    }
}
