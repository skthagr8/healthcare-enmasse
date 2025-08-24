package com.healthcare_enmasse.healthcare_enmasse;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class HealthcareEnmasseApplicationTests {

	@Test
	void contextLoads() {
	}

}
