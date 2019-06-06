package com.lwt.rabbitmq.rabbitmqproducer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class SendConfig {

    @Bean
   public Queue queue(){
        return new Queue("queue");
   }

   @Bean
   public Queue queues(){
        return new Queue("queues");
   }

}
