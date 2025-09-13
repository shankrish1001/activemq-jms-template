package com.shankrish.activemqjmstemplate.sender;

import jakarta.jms.Queue;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

    private final JmsTemplate jmsTemplate;
    private final Queue queue;

    public MessageSender(JmsTemplate jmsTemplate, Queue queue) {
        this.jmsTemplate = jmsTemplate;
        this.queue = queue;
    }

    public void send(String message) {
        jmsTemplate.convertAndSend(queue, message);
        System.out.println("Sent message: " + message);
    }

}

