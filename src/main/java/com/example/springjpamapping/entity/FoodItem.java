package com.example.springjpamapping.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class FoodItem extends IdClass{
    private String name;
    private int quantity;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Supplier supplier;

    @ManyToMany
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animal.getFoodItems().add(this);
        this.animals.add(animal);
    }

    public FoodItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
