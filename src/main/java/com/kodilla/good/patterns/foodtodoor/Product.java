package com.kodilla.good.patterns.foodtodoor;

public class Product {
    private String productName;

    Product(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return productName != null ? productName.equals(product.productName) : product.productName == null;
    }

    @Override
    public int hashCode() {
        return productName != null ? productName.hashCode() : 0;
    }
}
