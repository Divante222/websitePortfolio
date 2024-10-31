package com.example.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * this allows you to scan multiple folders
 */
// @SpringBootApplication(	
// 	scanBasePackages={"com.example.portfolio",
// 					  "com.example.util"}
// )
@SpringBootApplication
public class PortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioApplication.class, args);
	}

}
