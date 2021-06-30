package com.company.business.products;

import java.util.List;

public class Cart {

    private List<Product> items;
    private int numberOfProducts;

    public Cart() {
    }

    public Cart(List<Product> items) {
        this.items = items;
    }

    public List<Product> getAllProductDetails(){
        return this.items;
    }
}
