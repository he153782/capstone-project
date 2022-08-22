package com.bezkoder.spring.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
 * @EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
 * XADataSourceAutoConfiguration.class})
 */
public class SpringBootLoginExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoginExampleApplication.class, args);
		System.out.println("Hello van vu 1111111111111111");
	}

}
