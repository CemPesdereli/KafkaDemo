package com.cem.kafka.consumer;


import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.*;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "cem", groupId = "myGroup")
    public void consumeMsg(String msg){

        log.info(format("Consuming the message from cem Topic:: %s",msg));
    }
}
