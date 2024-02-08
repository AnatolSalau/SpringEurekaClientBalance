package com.example.zoo.component;

import dto.AnimalDto;
import org.springframework.stereotype.Component;

@Component
public class RandomAnimalClient {
      public AnimalDto random() {
            return new AnimalDto("Random Animal");
      }
}
