package com.example.Process.resource;

import com.example.Process.model.Proceso;
import com.example.Process.repository.ProcessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProcessController {
    @Autowired
    private ProcessRepository repository;

    @PostMapping("/addProcess")
    public String saveProcess(@RequestBody Proceso process) {
        repository.save(process);
        return "Added process with id : " + process.getId();
    }

    @GetMapping("/findAllProcess")
    public List<Proceso> getProcess() {
        return repository.findAll();
    }

    @GetMapping("/findAllProcess/{id}")
    public Optional<Proceso> getProcess(@PathVariable int id) {
        return repository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProcess(@PathVariable int id) {
        repository.deleteById(id);
        return "process deleted with id : " + id;
    }
}
