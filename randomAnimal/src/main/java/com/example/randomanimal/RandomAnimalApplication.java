package com.example.randomanimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RandomAnimalApplication {

      public static void main(String[] args) {
            SpringApplication.run(RandomAnimalApplication.class, args);
      }

}
