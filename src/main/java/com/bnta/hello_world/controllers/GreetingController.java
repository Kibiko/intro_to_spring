package com.bnta.hello_world.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greeting") //sets what route triggers this method, GET
    public String greeting(@RequestParam(defaultValue = "world") String name){ //http://localhost:8080/greeting?name=kevin
        return "Hello "+ name;
    }
}
