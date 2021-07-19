
package com.solace.demo.sohealthy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// import java.util.function.Consumer;
import java.util.function.Function;


@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	// @Bean
	// public Consumer<PatientHeartRateSchema> patientDataRawHrConsumer() {
	// 	return data -> {
	// 		// Add business logic here.	
	// 		logger.info(data.toString());
	// 	};
	// }

	// @Bean
	// public Consumer<PatientBloodPressureSchema> patientDataRawBpConsumer() {
	// 	return data -> {
	// 		// Add business logic here.	
	// 		logger.info(data.toString());
	// 	};
	// }


	/*
		Manual changes - change this to a SCS processor, take raw and send calc for each raw data receieved.
	*/
	@Bean
	public Function<PatientHeartRateSchema, PatientHeartRateSchema> patientDataRawHrFunction() {
		return reading -> {
			logger.info("Received Heart Rate Data: " + reading);
			// fake doing something :)
			logger.info("Sending: " + reading);
			return reading;
		};
	}
	@Bean
	public Function<PatientBloodPressureSchema, PatientBloodPressureSchema> patientDataRawBpFunction() {
		return reading -> {
			logger.info("Received Blood Pressure Data: " + reading);
			// fake doing something :)
			logger.info("Sending: " + reading);
			return reading;
		};
	}

}
