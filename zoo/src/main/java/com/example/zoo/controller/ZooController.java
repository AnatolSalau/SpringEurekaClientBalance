package com.example.zoo.controller;

import com.example.zoo.component.RandomAnimalClient;

import dto.AnimalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZooController {
      private final RandomAnimalClient randomAnimalClient;

      @Autowired
      public ZooController(RandomAnimalClient randomAnimalClient) {
            this.randomAnimalClient = randomAnimalClient;
      }

      @GetMapping("/animals/any")
      ResponseEntity<AnimalDto> getAnyAnimal(){

            AnimalDto animalDto = randomAnimalClient.random();

            return ResponseEntity
                  .ok()
                  .body(animalDto);
      }

}
