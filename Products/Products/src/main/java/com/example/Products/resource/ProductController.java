package com.example.Products.resource;

import com.example.Products.model.Product;
import com.example.Products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class ProductController {
    @RestController
    public class SellerController {
        @Autowired
        private ProductRepository repository;

        @PostMapping("/addProduct")
        public String saveProduct(@RequestBody Product product) {
            repository.save(product);
            return "Added product with id : " + product.getId();
        }

        @GetMapping("/findAllProduct")
        public List<Product> getProduct() {
            return repository.findAll();
        }

        @GetMapping("/findAllProduct/{id}")
        public Optional<Product> getProduct(@PathVariable int id) {
            return repository.findById(id);
        }


}
