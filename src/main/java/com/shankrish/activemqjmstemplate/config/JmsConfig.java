package com.shankrish.activemqjmstemplate.config;

import jakarta.jms.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.apache.activemq.command.ActiveMQQueue;

@Configuration
@EnableJms
public class JmsConfig {

    @Bean
    public Queue queue() {
        return new ActiveMQQueue("test-queue");
    }

}

