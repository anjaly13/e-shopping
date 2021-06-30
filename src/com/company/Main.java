package com.company;

import com.company.business.banking.CardPayment;
import com.company.business.banking.PaymentDetails;
import com.company.business.orders.Order;
import com.company.business.products.Product;
import com.company.users.User;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // create new user
        User user = new User("John","hoiHoi","john.com","home");
        System.out.println("User created! ");

        // login as user
        System.out.println("Try login.. " );;
        User loginUser = user.login("John","hoiHoi");

        // create a product
        Product product1 = new Product("Rubics cube","123","toy",100);
        System.out.println("products : " + product1.toString());

        // order product
        List<Product> items = new ArrayList<>();
        items.add(product1);
        Order order1 = new Order("Placed","normal",items);
        System.out.println("Order placed successfully! : "  +order1.toString());

        // do payment
        CardPayment cardPayment = new CardPayment("45677","National");
        PaymentDetails paymentDetails = new CardPayment();
        paymentDetails.setPaymentStatus("Successful");
        paymentDetails.setPaymentAddress("home");
        cardPayment.makePayment();
        cardPayment.savePaymentDetails(paymentDetails);

        System.out.println("Done");
    }
}
