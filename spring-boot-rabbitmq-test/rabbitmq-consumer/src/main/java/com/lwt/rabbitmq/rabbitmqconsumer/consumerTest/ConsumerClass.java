package com.lwt.rabbitmq.rabbitmqconsumer.consumerTest;

import com.lwt.rabbitmq.rabbitmqconsumer.dto.UserDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ConsumerClass {


    /**
     * 监听指定队列中的消息
     *
     * @param str
     */
    @RabbitListener(queues = "queue")//监听名称为queue的队列中的消息
    public void getQueueMessage(String str) {
        System.out.println("本次监听到的看消息内容为：" + str);

    }

    @RabbitListener(queues = "queues")
    public void getQueueMessageOfObject(Map<String,Object> map) {
        System.out.println("当前监听到的对象信息为：" + map);
    }


}
