package io.github.thepragmaticsquad.gateway.controller;

import io.github.thepragmaticsquad.gateway.config.MQConfig;
import io.github.thepragmaticsquad.gateway.enums.AccountType;
import io.github.thepragmaticsquad.gateway.model.BasicAccountModel;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagePublisher {
    private final RabbitTemplate rabbitTemplate;

    public MessagePublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping("/publish")
    public String publishMessage(@RequestBody BasicAccountModel accountModel) {
        rabbitTemplate.convertAndSend(MQConfig.ACCOUNT_EXCHANGE, MQConfig.ACCOUNT_ROUTING_KEY, accountModel);
        return "Message Published...";
    }
}
