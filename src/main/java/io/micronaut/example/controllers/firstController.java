package io.micronaut.example.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/firstpoint")
public class firstController {

    @Get("/{name}")
    public String Hello(String name){
        return name + " Welcome to First Point";
    }

}
