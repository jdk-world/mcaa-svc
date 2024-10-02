package com.mcaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class McaaSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(McaaSvcApplication.class, args);
	}

}
