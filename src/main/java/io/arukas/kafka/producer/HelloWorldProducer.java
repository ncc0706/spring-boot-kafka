package io.arukas.kafka.producer;

import io.arukas.kafka.channel.HelloWorldSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.http.MediaType;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(HelloWorldSource.class)
public class HelloWorldProducer {

    @Autowired
    private HelloWorldSource helloWorldSource;

    public boolean deliver(String jsonData) {

        try {
            Message<String> message = MessageBuilder.withPayload(jsonData)
                    .setHeader(MessageHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_UTF8_VALUE).build();
            boolean wasSent = helloWorldSource.output().send(message);
            System.out.println("wasSent: " + wasSent);
            return wasSent;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
