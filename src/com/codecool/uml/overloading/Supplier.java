package com.codecool.uml.overloading;

public class Supplier {

    private int id;

    private String name;

    private String description;


    public Supplier() {

    }

    public Supplier(String name, String description) {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {

    }

    public String toString() {
        return "";
    }
}
