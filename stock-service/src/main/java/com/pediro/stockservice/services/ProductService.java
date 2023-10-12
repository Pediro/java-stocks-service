package com.pediro.stockservice.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pediro.stockservice.models.Product;
import com.pediro.stockservice.repositories.ProductRepository;

@Component("productService")
public class ProductService {
    
    @Autowired
    ProductRepository productRepo;

    public Iterable<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getProduct(String name) throws Exception {
        Optional<Product> product = productRepo.findByName(name);

        if (product.isPresent())
            return product.get();
        
        throw new Exception("Product (" + name + ") could not be found");        
    }
}