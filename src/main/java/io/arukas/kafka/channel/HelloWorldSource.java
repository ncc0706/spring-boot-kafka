package io.arukas.kafka.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface HelloWorldSource {

	String OUTPUT = "helloworld-out";

	@Output(HelloWorldSource.OUTPUT)
	MessageChannel output();
	
}
