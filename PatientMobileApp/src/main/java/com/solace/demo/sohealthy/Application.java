
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
				"doctor-54321",
				"patient-12345",
				"msg-12345",
				"Hi doctor, I'm a bit sick :("
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

	@Bean
	public Supplier<PatientHeartRateSchema> patientDataRawHrSupplier() {
		return () -> {
			// Add business logic here.
			return new PatientHeartRateSchema(
				"2011-07-27T20:20:39+00:00",
				"patient-12345",
				"msg-12345",
				111
			);
		};
	}

	@Bean
	public Supplier<PatientBloodPressureSchema> patientDataRawBpSupplier() {
		return () -> {
			// Add business logic here.
			return new PatientBloodPressureSchema(
				"2011-07-27T20:20:39+00:00",
				99,
				"patient-12345",
				"msg-12345"
			);
		};
	}



}
