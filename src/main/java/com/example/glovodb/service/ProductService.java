package com.example.glovodb.service;

import com.example.glovodb.model.Product;
import com.example.glovodb.repository.ProductRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Product> getProductById(Integer orderId){
        return productRepository.findById(orderId);
    }
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    public Product addProduct(Product product){
        return productRepository.save(product);
    }
    public Product addProductToOrder(Product product, int id){
        product.setId(id);
        return productRepository.save(product);
    }

}//