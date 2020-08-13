package com.example.customer.resource;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository repository;
    @PostMapping("/addCustomer")
    public String saveCustomer(@RequestBody Customer customer) {
        repository.save(customer);
        return "Added customer with id : " + customer.getId();
    }

    @GetMapping("/findAllCustomer")
    public List<Customer> getCustomer() {
        return repository.findAll();
    }

    @GetMapping("/findAllCustomer/{id}")
    public Optional<Customer> getCustomer(@PathVariable int id) {
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        repository.deleteById(id);
        return "customer deleted with id : " + id;
    }
}
