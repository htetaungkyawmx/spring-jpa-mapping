package com.example.springjpamapping.dao;

import com.example.springjpamapping.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemDao extends JpaRepository<FoodItem, Integer> {

}
