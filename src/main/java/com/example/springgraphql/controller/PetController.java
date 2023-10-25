package com.example.springgraphql.controller;

import com.example.springgraphql.model.Pet;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
public class PetController {


    @QueryMapping
    public Flux<Pet> pets() {
        return Flux.fromIterable(List.of(new Pet("Bo Bo", "Grey")
        ,new Pet("Aung Net","Dark")));

    }
}
