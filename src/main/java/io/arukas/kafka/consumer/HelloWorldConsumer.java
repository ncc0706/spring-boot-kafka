package io.arukas.kafka.consumer;

import io.arukas.kafka.channel.HelloWorldSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(HelloWorldSink.class)
public class HelloWorldConsumer {

    @StreamListener(HelloWorldSink.INPUT)
    public void receiveMessage(String message){

        System.out.println("message: " + message);

    }

}

