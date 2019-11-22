package com.example.sgacc_final;

public class notification_product {

    private String date,detail;

    public notification_product(String date, String detail) {
        this.date = date;
        this.detail = detail;
    }

    public String getDate() {
        return date;
    }

    public String getDetail() {
        return detail;
    }
}