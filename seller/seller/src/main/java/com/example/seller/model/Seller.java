package com.example.seller.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Seller {
    @Id
    private int id;
    private String name;
    private String name;
    private String correo;
    private String usuario;
    private String phone;
    private String direccion;
    private List<Products> productos;

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
