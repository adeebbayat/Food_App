package com.adeebbayat.server.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adeebbayat.server.models.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment,Long> {
    List<Payment> findAll();
} 
