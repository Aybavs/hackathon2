package com.example.myapplication;

public class Atlet {
    private String name;
    private String country;

    public Atlet(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}