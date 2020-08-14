package com.example.customer.model;

import org.springframework.data.annotation.Id;

public class Customer {
    @Id
    private int id;
    private String name;
    private String correo;
    private String usuario;
    private String phone;
    private String direccion;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
