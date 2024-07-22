package org.springframework.amqp.tutorials.rabbitmq;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQTestController {

    private final EnqueueDequeService enqueueDequeService;

    public RabbitMQTestController(EnqueueDequeService enqueueDequeService) {
        this.enqueueDequeService = enqueueDequeService;
    }

    @PostMapping("/publish")
    public String publishMessage(@RequestBody CustomerDto message) {
        enqueueDequeService.publishMessage(message);
        return "message saved";
    }
}
