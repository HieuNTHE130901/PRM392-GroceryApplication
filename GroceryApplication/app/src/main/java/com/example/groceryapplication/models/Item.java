package com.example.groceryapplication.models;

import java.io.Serializable;

public class Item implements Serializable {
    private String name;
    private String img_url;
    private String description;
    private double price;


    public Item() {
    }

    public Item(String name, String img_url, String description, double price) {
        this.name = name;
        this.img_url = img_url;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
