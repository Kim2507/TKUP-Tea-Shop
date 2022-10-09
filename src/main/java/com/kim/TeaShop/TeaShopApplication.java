package com.kim.TeaShop;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@EnableJpaRepositories(basePackages="com.capstone.TeaShop.repository")
public class TeaShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeaShopApplication.class, args);
	}

}
