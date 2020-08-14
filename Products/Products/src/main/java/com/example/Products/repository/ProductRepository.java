package com.example.Products.repository;

import com.example.Products.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,Integer> {
}
