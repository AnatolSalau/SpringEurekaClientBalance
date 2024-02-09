package com.example.zoo.component;


import dto.AnimalDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import static java.rmi.server.LogStream.log;

@Slf4j
@Component
public class RandomAnimalClient {
      private final RestTemplate restTemplate;

      @Autowired
      public RandomAnimalClient(RestTemplate restTemplate) {
            this.restTemplate = restTemplate;
      }

      //spring.application.name=random-animal есть в настройках Random Animal
      public AnimalDto random() {
            log.info("Sending  request for animal ");
            AnimalDto animalDto = restTemplate.getForEntity("http://random-animal/random",
                  AnimalDto.class).getBody();
            return animalDto;
      }
}
