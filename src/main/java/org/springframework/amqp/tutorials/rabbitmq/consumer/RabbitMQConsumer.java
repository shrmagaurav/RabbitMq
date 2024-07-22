package org.springframework.amqp.tutorials.rabbitmq.consumer;

import org.springframework.amqp.core.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer {

    Logger LOGGER = LoggerFactory.getLogger(RabbitMQConsumer.class);

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void consume(Message message) {
        var routingKey = message.getMessageProperties().getReceivedRoutingKey();
//        LOGGER.info("RoutingKey is ->" ,routingKey);
        var data = message.getBody();
//        CustomerDto result = new CustomerDto();
        String messageBody = new String(data);
        LOGGER.info("Received message with routing key '" + routingKey + "': " + messageBody);
    }
}