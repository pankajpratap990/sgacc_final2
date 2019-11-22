package com.example.sgacc_final;

public class home_product {

    private String title,description;
    private int img;

    public home_product(String title, String description, int img) {
        this.title = title;
        this.description = description;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImg() {
        return img;
    }
}
