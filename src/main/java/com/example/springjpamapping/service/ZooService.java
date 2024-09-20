package com.example.springjpamapping.service;

import com.example.springjpamapping.dao.CategoryDao;
import com.example.springjpamapping.entity.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ZooService {
    private final CategoryDao categoryDao;

    public void createDb() {
        Cage cage1 = new Cage("S001","South");
        Cage cage2 = new Cage("N001","North");
        Cage cage3 = new Cage("E001","East");
        Cage cage4 = new Cage("W001","West");

        Animal animal1 = new Animal("Tiger",75);
        Animal animal2 = new Animal("Dear",25);
        Animal animal3 = new Animal("Python",10);
        Animal animal4 = new Animal("Fish",50);

        Category category1 = new Category("Carnivore");
        Category category2 = new Category("Non-Carnivore");

        Supplier supplier1 = new Supplier("Mary James","11041","South Asia");
        Supplier supplier2 = new Supplier("Jon Doe","11001","North Europe");

        FoodItem foodItem1 = new FoodItem("Meat",50);
        FoodItem foodItem2 = new FoodItem("Wheat",100);
        FoodItem foodItem3 = new FoodItem("Veg",200);
        FoodItem foodItem4 = new FoodItem("Grains",300);

        //mapping
        
    }
}
