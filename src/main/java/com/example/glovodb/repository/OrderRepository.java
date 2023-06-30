package com.example.glovodb.repository;

import com.example.glovodb.model.Order;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Integer> {
    List<Order> findAll();
    Order findById(int id);
    Order save(Order order);

}
