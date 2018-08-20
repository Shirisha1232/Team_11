package com.capg.boot.ShippingDetailsBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages="com.capg.boot.ShippingDetailsBoot")
public class ShippingDetailsBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShippingDetailsBootApplication.class, args);
	}
}
