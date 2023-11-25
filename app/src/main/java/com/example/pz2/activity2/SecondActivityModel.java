package com.example.pz2.activity2;

public class SecondActivityModel {
    private String name;
    private String address;
    private String productCount;

    // Конструктор за замовчуванням
    public SecondActivityModel() {
        name = "";
        address = "";
        productCount = "";
    }

    // Конструктор з параметрами
    public SecondActivityModel(String name, String address, String productCount) {
        this.name = name;
        this.address = address;
        this.productCount = productCount;
    }

    // Геттери та сеттери
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

    public String getProductCount() {
        return productCount;
    }

    public void setProductCount(String productCount) {
        this.productCount = productCount;
    }
}
