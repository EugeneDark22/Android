package com.example.pz2.model;
import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;

public class Store implements Serializable {
    private String name;
    private String address;
    private int productCount;

    public Store(String name, String address, int productCount) {
        this.name = name;
        this.address = address;
        this.productCount = productCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}
