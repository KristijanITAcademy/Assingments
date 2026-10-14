package com.itacademy.core.product;

public class Chocolate extends Product{
    public int weight;

    public Chocolate(String name, int barcode, double price, int weight) {
        super(name, barcode, price);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + "Tezina: " + weight + '\n' + "Cijena s PDV: " + priceWithPDV();
    }
}
