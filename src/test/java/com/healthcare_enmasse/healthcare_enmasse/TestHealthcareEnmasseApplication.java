package com.healthcare_enmasse.healthcare_enmasse;

import org.springframework.boot.SpringApplication;

public class TestHealthcareEnmasseApplication {

	public static void main(String[] args) {
		SpringApplication.from(HealthcareEnmasseApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
