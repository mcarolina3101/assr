package com.example.Store.repository;

import com.example.Store.model.Store;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreRepository extends MongoRepository <Store, Integer> {

}

