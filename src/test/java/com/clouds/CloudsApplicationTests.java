package com.clouds;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootTest
class CloudsApplicationTests {
	private static final Logger logger = LogManager.getLogger(CloudsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info(CloudsApplicationTests.class.getName());
	}

}
