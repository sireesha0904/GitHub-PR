package com.example.SpringMaven;

import org.springframework.stereotype.Component;

@Component
public class Price {

    private String price;

    public String getPrice() {
        return price;
    }
    

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Rs.50000";
        
    }
}
