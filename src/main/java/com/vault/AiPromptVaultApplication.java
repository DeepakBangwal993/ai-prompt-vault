package com.vault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.vault")
public class AiPromptVaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiPromptVaultApplication.class, args);
	}

}