package com.learning.clouds;

import org.springframework.boot.SpringApplication;

public class TestCloudsApplication {

	public static void main(String[] args) {
		SpringApplication.from(CloudsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
