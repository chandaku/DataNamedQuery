package com.data.named.query;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DataNamedQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataNamedQueryApplication.class, args);
	}
}
