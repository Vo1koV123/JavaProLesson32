package com.example.glovodb.repository;

import com.example.glovodb.model.Order;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends CrudRepository<Order, Integer> {
    List<Order> findAll();
    Optional<Order> findById(int id);
    Order save(Order order);

}
//