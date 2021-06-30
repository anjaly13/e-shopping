package com.company.business.orders;

import com.company.business.products.Product;

import java.util.List;

public class Order {

    private String orderStatus;
    private String orderType;
    private List<Product> items;

    public Order() {
    }

    public Order(String orderStatus, String orderType, List<Product> items) {
        this.orderStatus = orderStatus;
        this.orderType = orderType;
        this.items = items;
    }

    public String trackOrder(){
        return "";
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderStatus='" + orderStatus + '\'' +
                ", orderType='" + orderType + '\'' +
                ", items=" + items +
                '}';
    }
}
