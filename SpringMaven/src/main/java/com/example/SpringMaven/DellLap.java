package com.example.SpringMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dell")
public class DellLap implements Laptop {
    @Autowired
    private Price price;
    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public void display() {
        System.out.println("This is a Dell Laptop. Price: " + price);
    }
}
