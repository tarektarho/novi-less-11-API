package nl.novi.apiApp.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {


    @GetMapping("/api/greeting")
    public String greeting() {
        return "Hello, World!";
    }

    @GetMapping("/api/greeting/{name}")
    public String greetingWithName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/api/greeting/{name}/{age}")
    public String greetingWithNameAndAge(@PathVariable String name, @PathVariable int age) {
        if (age < 0) {
            return "Age must be a positive number.";
        }
        return "Hello, " + name + "! You are " + age + " years old.";
    }
}
