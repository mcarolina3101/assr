package com.example.Process.resource;

import com.example.Process.model.Customer;
import com.example.Process.model.Proceso;
import com.example.Process.model.Product;
import com.example.Process.model.Seller;
import com.example.Process.repository.CustomerRepository;
import com.example.Process.repository.ProcessRepository;
import com.example.Process.repository.ProductRepository;
import com.example.Process.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class ProcessController {
    @Autowired
    private ProcessRepository repository;
    private CustomerRepository customerRepository;
    private ProductRepository productRepository;
    private SellerRepository sellerRepository;

    @PostMapping("/addProcess/customer/{customer}/product/{id}/seller/{seller}/Date{date}")
    public String saveProcess(@PathVariable int id,@PathVariable String customer, @PathVariable String seller,@PathVariable Date date){
        Customer customerUser = customerRepository.findByUser(customer);
        Seller sellerUser = sellerRepository.findByUser(seller);
        Optional<Product> productUser = productRepository.findById(id);
        Proceso process=new Proceso(
                1,
                date,
                customerUser.getDireccion(),
                customerUser.getPhone(),
                sellerUser.getPhone(),
                productUser<1>.getName(),
                productUser<1>.getPrice(),
                customerUser.getUser(),
                sellerUser.getUser());

        repository.save(process);
        return "Added process with id : " + process.getId();
    }

    @GetMapping("/customer/{customer}/product/{id}/seller/{seller}")
    public Optional<Proceso> getProcess(@PathVariable int id) {
        return repository.findById(id);
    }

}
