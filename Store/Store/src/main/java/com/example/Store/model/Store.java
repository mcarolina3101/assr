package com.example.Store.model;

import org.checkerframework.checker.units.qual.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import java.util.Date;

@Document(collection = "Store")

public class Store {
    @Id
    private int id;
    private String storeName;
    private String addressstreet;
    private String addresscity;
    private String addresssprovince;
    private String addresscountry;
    private String addresspostalcode;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddressstreet() {
        return addressstreet;
    }

    public void setAddressstreet(String addressstreet) {
        this.addressstreet = addressstreet;
    }

    public String getAddresscity() {
        return addresscity;
    }

    public void setAddresscity(String addresscity) {
        this.addresscity = addresscity;
    }

    public String getAddresssprovince() {
        return addresssprovince;
    }

    public void setAddresssprovince(String addresssprovince) {
        this.addresssprovince = addresssprovince;
    }

    public String getAddresscountry() {
        return addresscountry;
    }

    public void setAddresscountry(String addresscountry) {
        this.addresscountry = addresscountry;
    }

    public String getAddresspostalcode() {
        return addresspostalcode;
    }

    public void setAddresspostalcode(String addresspostalcode) {
        this.addresspostalcode = addresspostalcode;
    }
}
