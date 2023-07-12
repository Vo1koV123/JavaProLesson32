package com.example.glovodb.controller;

import com.example.glovodb.model.Order;
import com.example.glovodb.model.Product;
import com.example.glovodb.service.OrderService;
import com.example.glovodb.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

private final OrderService orderService;
private final ProductService productService;

    public OrderController(OrderService orderService, ProductService productService) {
        this.orderService = orderService;
        this.productService = productService;
    }
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    //
    @GetMapping("/{id}")
    public Optional<Order> getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }
    @PostMapping
    public Order addOrder(@RequestBody Order order){
        return orderService.addOrder(order);
    }
    @PostMapping("/orders/{id}")
    public Product addProductToOrder(@RequestBody Product product, int id){
        return productService.addProductToOrder(product, id);
    }
}