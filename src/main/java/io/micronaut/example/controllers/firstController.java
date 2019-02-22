package io.micronaut.example.controllers;

import io.micronaut.example.entities.Response;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/firstpoint")
public class firstController {

    @Get("/{name}")
    public Response Hello(String name) {
        Response response = new Response();
        response.setMessage(name + " Welcome to First Point");
        return response;
    }

}
