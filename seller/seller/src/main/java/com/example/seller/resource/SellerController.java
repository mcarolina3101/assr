package com.example.seller.resource;

import com.example.seller.model.Seller;
import com.example.seller.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SellerController {
    @Autowired
    private SellerRepository repository;

    @PostMapping("/addSeller")
    public String saveSeller(@RequestBody Seller seller) {
        repository.save(seller);
        return "Added seller with id : " + seller.getId();
    }

    @GetMapping("/findAllSeller")
    public List<Seller> getSeller() {
        return repository.findAll();
    }

    @GetMapping("/findAllSeller/{id}")
    public Optional<Seller> getSeller(@PathVariable int id) {
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSeller(@PathVariable int id) {
        repository.deleteById(id);
        return "seller deleted with id : " + id;
    }
}