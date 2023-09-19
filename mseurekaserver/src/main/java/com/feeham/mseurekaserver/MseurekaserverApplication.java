package com.feeham.mseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MseurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MseurekaserverApplication.class, args);
	}

}
