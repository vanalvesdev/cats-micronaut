package br.com.vaanalvesr.service;

import br.com.vaanalvesr.model.BreedWrapper;
import br.com.vaanalvesr.model.CatFact;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("${endpoints.cats}")
public interface CatService {

    @Get("/breeds")
    BreedWrapper listar();

    @Get("/fact")
    CatFact getFact();
}
