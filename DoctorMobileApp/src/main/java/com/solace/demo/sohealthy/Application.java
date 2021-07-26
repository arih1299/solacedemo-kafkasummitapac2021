
package com.solace.demo.sohealthy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Supplier;



@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public Supplier<ChatMessageSchema> chatMsgSupplier() {
		return () -> {
			// Add business logic here.
			return new ChatMessageSchema(
				"2011-07-27T20:20:39+00:00",
				"patient-12345",
				"doctor-54321",
				"msg-12345",
				"Hi patient, how are you? :)"
			);
		};
	}

	@Bean
	public Consumer<ChatMessageSchema> chatMsgConsumer() {
		return data -> {
			// Add business logic here.	
			logger.info(data.toString());
		};
	}

	@Bean
	public Consumer<PatientAlertSchema> alertPatientConsumer() {
		return data -> {
			// Add business logic here.	
			logger.info(data.toString());
		};
	}



}
