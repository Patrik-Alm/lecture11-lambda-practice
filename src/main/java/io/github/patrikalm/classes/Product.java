package io.github.patrikalm.classes;

public class Product {

    private String productName;
    private double price;
    private int stock;


    public Product (String productName, double price, int stock) {

        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public String toString(Product product) {

        return product.toString();

    }



    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }






}