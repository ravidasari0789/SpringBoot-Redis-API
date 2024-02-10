package com.raviit.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringBootRedisApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisApiApplication.class, args);
	}

}
