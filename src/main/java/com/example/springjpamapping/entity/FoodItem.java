package com.example.springjpamapping.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class FoodItem extends IdClass {
    private String name;
    private int quantity;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Supplier supplier;

    @ManyToMany
    @JoinTable(
            name = "food_item_animals",
            joinColumns = @JoinColumn(name = "food_item_id"),
            inverseJoinColumns = @JoinColumn(name = "animal_id")
    )
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
