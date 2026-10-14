package com.itacademy.core.product;

public abstract class Product {
    private String name;
    private int barcode;
    public double price;

    public Product(String name, int barcode, double price) {
        this.name = name;
        this.barcode = barcode;
        this.price = price;
    }

    public static final double PDV = 0.2;

    public double priceWithPDV(){
        return price * (1 + PDV);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "Name: " + name + '\n'+
                "Barcode: " + barcode +'\n' +
                "Price: " + price;
    }
}
