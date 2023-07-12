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

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    private final OrderRepository orderRepository;

        public Optional<Order> getOrderById(int id){
            return orderRepository.findById(id);
        }
    //
        public List<Order> getAllOrders(){
            return orderRepository.findAll();
        }
        public Order addOrder(Order order){
            return orderRepository.save(order);
        }

}