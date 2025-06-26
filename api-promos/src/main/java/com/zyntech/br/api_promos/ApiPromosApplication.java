package com.zyntech.br.api_promos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApiPromosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPromosApplication.class, args);
	}

}
