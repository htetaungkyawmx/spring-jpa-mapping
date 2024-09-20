package com.example.springjpamapping.dao;

import com.example.springjpamapping.entity.Cage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CageDao extends JpaRepository<Cage, Integer> {

}
