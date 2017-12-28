package io.arukas.kafka.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface HelloWorldSink {

	String INPUT = "helloworld-input";

	@Input(HelloWorldSink.INPUT)
	MessageChannel input();
	
}
