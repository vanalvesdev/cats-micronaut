package br.com.vaanalvesr.resource;

import br.com.vaanalvesr.model.BreedWrapper;
import br.com.vaanalvesr.model.Cat;
import br.com.vaanalvesr.repository.CatRepository;
import br.com.vaanalvesr.service.CatService;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller("/cats")
public class CatResource {

    @Inject
    CatService service;

    @Inject
    CatRepository repository;

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public BreedWrapper listar() {
        return service.listar();
    }

    @Get("/performance")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPerformance() {
        return service.getFact().getFact();
    }
}
