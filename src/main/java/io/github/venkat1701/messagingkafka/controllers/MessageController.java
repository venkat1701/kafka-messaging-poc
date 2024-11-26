package io.github.venkat1701.messagingkafka.controllers;


import io.github.venkat1701.messagingkafka.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mobile")
public class MessageController {
    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/sendMessage")
    public void sendMessage(@RequestParam String key, @RequestParam String senderNumber, @RequestParam String recipientNumber, @RequestParam String bodyMessage) {
        kafkaService.sendMessage(key, senderNumber, recipientNumber, bodyMessage);
    }
}
