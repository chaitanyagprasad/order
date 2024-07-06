package com.chait.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.*;
import org.springframework.cloud.client.discovery.*;

	@SpringBootApplication
	@EnableConfigurationProperties
	@EnableDiscoveryClient
	public class OrderApplication {

		public static void main(String[] args) {
			SpringApplication.run(OrderApplication.class, args);
		}

	}
