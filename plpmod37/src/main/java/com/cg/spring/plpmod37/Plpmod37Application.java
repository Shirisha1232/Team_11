package com.cg.spring.plpmod37;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.spring.plpmod37")
public class Plpmod37Application {

	public static void main(String[] args) {
		SpringApplication.run(Plpmod37Application.class, args);
	}
}
