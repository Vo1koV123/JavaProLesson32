package com.example.glovodb.service;

import com.example.glovodb.model.Order;
import com.example.glovodb.repository.OrderRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class OrderService {
    private final ProductService productService;

    private final OrderRepository orderRepository;

        public Optional<Order> getOrderById(Integer id){
            return orderRepository.findById(id);
        }

        public List<Order> getAllOrder(){
            return orderRepository.findAll();
        }
        public Order addOrder(Order order){
            return orderRepository.save(order);
        }

}