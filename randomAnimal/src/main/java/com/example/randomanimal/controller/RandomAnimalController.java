package com.example.randomanimal.controller;

import com.example.randomanimal.component.AnimalDtoComponent;
import dto.AnimalDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomAnimalController {

      private final AnimalDtoComponent animalDtoComponent;

      @Autowired
      public RandomAnimalController(AnimalDtoComponent animalDtoComponent) {
            this.animalDtoComponent = animalDtoComponent;
      }

      @GetMapping("/random")
      public ResponseEntity<AnimalDto> randomAnimal(){
            AnimalDto animal=animalDtoComponent.random();
            System.out.println(animal);
            return ResponseEntity
                  .ok(animal);
      }
}
