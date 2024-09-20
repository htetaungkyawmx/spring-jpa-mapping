package com.example.springjpamapping.dao;

import com.example.springjpamapping.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalDao extends JpaRepository<Animal, Integer> {

}
