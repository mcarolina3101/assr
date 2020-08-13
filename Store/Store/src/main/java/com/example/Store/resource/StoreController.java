package com.example.Store.resource;

import com.example.Store.model.Store;
import com.example.Store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StoreController {
    @Autowired
    private StoreRepository repository;

    @PostMapping("/addStore")
    public String saveStore(@RequestBody Store store) {
        repository.save(store);
        return "Added store with id : " + store.getId();
    }

    @GetMapping("/findAllStores")
    public List<Store> getStores() {
        return repository.findAll();
    }

    @GetMapping("/findAllStores/{id}")
    public Optional<Store> getStore(@PathVariable int id) {
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStore(@PathVariable int id) {
        repository.deleteById(id);
        return "store deleted with id : " + id;
    }
}