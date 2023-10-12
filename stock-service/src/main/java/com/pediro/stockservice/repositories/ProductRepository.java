package com.pediro.stockservice.repositories;

import java.util.Optional;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pediro.stockservice.models.Product;

@EnableScan
@Repository
public interface ProductRepository extends CrudRepository<Product, String>{
    
    public Optional<Product> findByName(String name);
}
