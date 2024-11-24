package nl.novi.apiApp.controllers;

import nl.novi.apiApp.service.DogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {


    @GetMapping("/api/dog")
    public String MeetMyDog() {
        DogService dog = new DogService("Milo", "Labrador Retriever", 3.5);
        return "Hello, my name is " + dog.getName() + " and I am a " + dog.getBreed() + " and I am " + dog.getAge() + " years old.";
    }

}
