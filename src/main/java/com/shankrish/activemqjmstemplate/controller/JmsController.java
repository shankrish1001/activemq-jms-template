package com.shankrish.activemqjmstemplate.controller;

import com.shankrish.activemqjmstemplate.sender.MessageSender;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/jms")
public class JmsController {

    private final MessageSender sender;

    public JmsController(MessageSender sender) {
        this.sender = sender;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody String msg) {
        sender.send(msg);
        return ResponseEntity.ok("Message sent: " + msg);
    }

}

