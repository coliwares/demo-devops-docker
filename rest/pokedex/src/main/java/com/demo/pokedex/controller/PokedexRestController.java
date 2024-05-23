package com.demo.pokedex.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pokedex.model.Pokemon;
import com.demo.pokedex.service.PokedexService;
import com.demo.pokedex.service.PokedexServiceImpl;

import org.springframework.web.bind.annotation.RequestMethod;


@CrossOrigin
@RestController
@RequestMapping("/pokedex")
public class PokedexRestController {

    @RequestMapping(value="getPokemon/{id}", method = RequestMethod.GET)
    public ResponseEntity<Pokemon> getPokemon(@PathVariable String id) {
        System.out.println("Fetching Pokemon details for id: " + id + " in the REST controller");
        PokedexService pokedexService = new PokedexServiceImpl();
        Pokemon pokemon = pokedexService.getPokemon(id);
        return ResponseEntity.ok(pokemon);
    }

}
