package com.lwt.rabbitmq.rabbitmqconsumer.consumerTest;

import dto.UserDtos;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(bindings = @QueueBinding(
        value = @Queue(value = "${mq.config.queue.myQueue1}", autoDelete = "true"),
        exchange = @Exchange(value = "${mq.config.exchange}", type = ExchangeTypes.DIRECT),
        key = "${mq.config.queue.routingKey1}"
))
public class QueueExchangClass {
    @RabbitHandler
    public void messageOfConsumer(String meg) {
        System.out.println("通过路由键绑定来获取的消息为" + meg);
    }

    @RabbitHandler
    public void getMessage(UserDtos user) {
        System.out.println("获取到的user对象为：" + user.toString());
    }

}
