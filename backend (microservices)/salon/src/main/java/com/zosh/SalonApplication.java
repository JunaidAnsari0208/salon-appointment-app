package com.zosh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SalonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalonApplication.class, args);
	}

}
