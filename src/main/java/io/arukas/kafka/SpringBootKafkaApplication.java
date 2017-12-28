package io.arukas.kafka;

import io.arukas.kafka.producer.HelloWorldProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootKafkaApplication {

	@Autowired
	private HelloWorldProducer helloWorldProducer;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaApplication.class, args);
	}

	@GetMapping("/message")
	public void sendMessage(@RequestParam(defaultValue = "hello") String message){
		helloWorldProducer.deliver(message);
	}
}
