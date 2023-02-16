package br.com.vaanalvesr.repository;

import br.com.vaanalvesr.model.Cat;
import io.micronaut.context.annotation.Executable;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.UUID;

@Repository
public interface CatRepository extends CrudRepository<Cat, UUID> {

    @Executable
    Cat findByName(String name);
}
