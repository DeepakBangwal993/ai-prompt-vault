package com.promptvault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AiPromptVaultApplication {
    public static void main(String[] args) {
        SpringApplication.run(AiPromptVaultApplication.class, args);
    }
}