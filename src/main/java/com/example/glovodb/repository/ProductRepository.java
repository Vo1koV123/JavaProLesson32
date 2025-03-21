package com.example.glovodb.repository;

import com.example.glovodb.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findAll();
    Product findById(int id);
    Product save(Product product);
}