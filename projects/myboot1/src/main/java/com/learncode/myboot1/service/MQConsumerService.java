package com.learncode.myboot1.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MQConsumerService {

    private String text;

//    @JmsListener(destination = "queue.fsh.ord.planeticket.book")//监听指定消息队列
//    public void receiveQueue(String text) {
//        System.out.println(text);
//    }

    public String receive() {
        return text;
    }
}
