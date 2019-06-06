package com.lwt.rabbitmq.rabbitmqproducer.sendTest;

import com.lwt.rabbitmq.rabbitmqproducer.dto.UserDto;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SendClass {

    @Autowired
    private AmqpTemplate amqpTemplate;


    /**
     * 向指定的队列中发送数据
     */
    public void sendMessage() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.currentThread().sleep(5000);
                amqpTemplate.convertAndSend("queue", "这是我的第" + i + "个rabbitMQ消息");
                System.out.println("已经发送了" + i + "条数据");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 向指定的queues队列中发送userDto对象
     */
    public void sendMessageOfObject() {
        UserDto user = new UserDto(100, "admin", "testAdmin");
        System.out.println("发送的数据为"+user.toString());
        Map<String,Object> map = new HashMap<>();
        map.put("username","admin");
        amqpTemplate.convertAndSend("queues", map);
    }

}
