package com.example.pz2.activity1;

public class MainActivityModel {
    private String name;
    private String address;
    private String productCount;
    private boolean shouldShowErrorMessage;
    private boolean shouldNavigateToSecondView;

    // Конструктор за замовчуванням
    public MainActivityModel() {
        name = "";
        address = "";
        productCount = "";
    }

    // Конструктор з параметрами, якщо потрібно
    public MainActivityModel(String name, String address, String productCount) {
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

    public boolean isShouldShowErrorMessage() {
        return shouldShowErrorMessage;
    }

    public void setShouldShowErrorMessage(boolean shouldShowErrorMessage) {
        this.shouldShowErrorMessage = shouldShowErrorMessage;
    }

    public boolean isShouldNavigateToSecondView() {
        return shouldNavigateToSecondView;
    }

    public void setShouldNavigateToSecondView(boolean shouldNavigateToSecondView) {
        this.shouldNavigateToSecondView = shouldNavigateToSecondView;
    }

    // Методи для скидання станів
    public void cleanShouldShowErrorMessage() {
        this.shouldShowErrorMessage = false;
    }

    public void cleanShouldNavigateToSecondView() {
        this.shouldNavigateToSecondView = false;
    }
}
