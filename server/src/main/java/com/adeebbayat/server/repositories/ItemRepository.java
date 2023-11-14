package com.adeebbayat.server.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adeebbayat.server.models.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item,Long> {
    List<Item> findAll();
} 
