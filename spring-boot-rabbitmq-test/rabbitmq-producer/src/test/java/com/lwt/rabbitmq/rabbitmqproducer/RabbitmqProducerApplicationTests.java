package com.lwt.rabbitmq.rabbitmqproducer;

import com.lwt.rabbitmq.rabbitmqproducer.sendTest.SendClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RabbitmqProducerApplication.class)
public class RabbitmqProducerApplicationTests {

    @Autowired
    private SendClass sendClass;

    @Test
    public void contextLoads() {
        sendClass.sendMessage();
    }

    @Test
    public void getMessageOfObjct(){
        sendClass.sendMessageOfObject();

    }

}
