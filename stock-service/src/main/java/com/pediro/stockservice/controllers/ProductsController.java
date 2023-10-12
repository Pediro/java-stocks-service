package com.pediro.stockservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pediro.stockservice.models.Product;
import com.pediro.stockservice.services.ProductService;

@RestController
public class ProductsController {

    @Autowired
    ProductService productService;
    
    @GetMapping(value="/products")
    public ResponseEntity<Iterable<Product>> GetProducts() {
        return ResponseEntity.ok(productService.getProducts());
    }

    @RequestMapping(value="/product/{name}")
    public ResponseEntity<Product> GetProduct(@PathVariable("name") String name) throws Exception {
        return ResponseEntity.ok(productService.getProduct(name));
    }
}
