package com.baseogm;

import java.util.ArrayList;
import java.util.List;

import com.baseogm.controllers.BreedController;
import com.baseogm.controllers.DogController;
import com.baseogm.controllers.DonoController;
import com.baseogm.models.Breed;
import com.baseogm.models.Dog;
import com.baseogm.models.Dono;

public class App {
    public static void main(String[] args) {
        // Controladores
        BreedController breedController = new BreedController();
        DogController dogController = new DogController();
        DonoController donoController = new DonoController();

        // Modelos
        Breed breed = new Breed();
        breed.setName("Pastor Alemão");

        Dog dog1 = new Dog();
        dog1.setName("Catioro1");
        dog1.setBreed(breed);

        Dog dog2 = new Dog();
        dog2.setName("Catioro2");
        dog2.setBreed(breed);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);

        Dono dono = new Dono();
        dono.setName("João");
        dono.setDogs(dogs);

        breedController.save(breed);
        dogController.save(dog1);
        dogController.save(dog2);
        donoController.save(dono);
        
        // System.out.println(breed);
        // System.out.println(dog);
    }

}