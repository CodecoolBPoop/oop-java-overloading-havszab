package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Product {

    private int id;

    private String name;

    private float defaultPrice;

    private Currency defaultCurrency;

    private ProductCategory productCategory;

    private Supplier supplier;

    private List<Product> productList = new ArrayList<>();


    public Product () {

    }

    public Product(String name, float defaultPrice, Currency defaultCurrency) {
        this.setName(name);
        this.setDefaultPrice(defaultPrice);
        this.setDefaultCurrency(defaultCurrency);
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

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<Product> getAllProductsBy(ProductCategory productCategory) {
        for (int i = 0; i <0; i++) {
            productList.add(productCategory.getProducts().);
        }

    }

    public List<Product> getAllProductsBy(Supplier supplier) {
        //TODO
    }

    public String toSting() {
        return this.id + ";" + this.name + ";" + this.defaultPrice;
    }
}
