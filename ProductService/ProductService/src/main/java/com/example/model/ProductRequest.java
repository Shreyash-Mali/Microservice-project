package com.example.model;

public class ProductRequest {
    private String productName;
    private long price;
    private long quantity;

    public String getProductName() {
        return productName;
    }

    public long getPrice() {
        return price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public ProductRequest(String productName, long price, long quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public ProductRequest() {
    }
}
