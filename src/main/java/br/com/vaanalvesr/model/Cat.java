package br.com.vaanalvesr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
public class Cat {

    @Id
    @GeneratedValue
    private UUID id;

    @NotNull
    @Size(max = 15)
    private String name;

    private Integer age;

    @ManyToOne
    private Breed breed;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
}
