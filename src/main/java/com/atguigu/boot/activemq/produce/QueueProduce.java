package com.atguigu.boot.activemq.produce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.UUID;

/**
 * 队列 生产者
 * Program Name: activemq
 * Created by yanlp on 2019-10-19
 *
 * @author yanlp
 * @version 1.0
 */
@Component
public class QueueProduce {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue queue;

    /**
     * 正常生产消息
     */
    public void produceMsg() {
        jmsMessagingTemplate.convertAndSend(queue,"*******: " + UUID.randomUUID().toString().substring(0,6));
    }

    /**
     * 每隔3秒钟生产一条消息
     */
    @Scheduled(fixedDelay = 3000)
    public void produceMsgScheduled() {
        jmsMessagingTemplate.convertAndSend(queue,"******* produceMsgScheduled: " + UUID.randomUUID().toString().substring(0,6));
        System.out.println("*********produceMsgScheduled  send ok");
    }


}
