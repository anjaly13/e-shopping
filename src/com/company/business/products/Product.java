package com.company.business.products;

public class Product {

    private String productName;
    private String productNumber;
    private String productCategory;
    private int price;

    public Product() {
    }

    public Product(String productName, String productNumber, String productCategory, int price) {
        this.productName = productName;
        this.productNumber = productNumber;
        this.productCategory = productCategory;
        this.price = price;
    }

    public Product getItemDetails(){
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productNumber='" + productNumber + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", price=" + price +
                '}';
    }
}
