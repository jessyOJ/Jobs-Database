package com.mycompany.Jobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobsApplication {


	public static void main(String[] args) {
		System.setProperty("server.port","8083");
		SpringApplication.run(JobsApplication.class, args);
	}

}
