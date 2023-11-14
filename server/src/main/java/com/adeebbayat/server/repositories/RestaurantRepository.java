package com.adeebbayat.server.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adeebbayat.server.models.Restaurant;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant,Long> {
    List<Restaurant> findAll();
} 
