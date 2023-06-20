package io.github.thepragmaticsquad.gateway.service;

import io.github.thepragmaticsquad.gateway.config.RabbitMQConfig;
import io.github.thepragmaticsquad.gateway.model.SimpleTransactionModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;


@Service
public class TransactionPublisher {
    private final RabbitTemplate rabbitTemplate;

    Logger logger = LoggerFactory.getLogger(TransactionPublisher.class);
    public TransactionPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }


    public void processTransaction(SimpleTransactionModel transaction) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.TRANSACTION_EXCHANGE, RabbitMQConfig.TRANSACTION_ROUTING_KEY, transaction);
        logger.info("Transaction Published...");
    }
}
