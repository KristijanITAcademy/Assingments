package com.itacademy.core.product;

public class Wine extends Product {
    public double zapremnina;
    public Wine(String name, int barcode, double price, double zapremnina) {
        super(name, barcode, price);
        this.zapremnina = zapremnina;

    }

    @Override
    public double priceWithPDV() {
        return super.priceWithPDV() * 1.1;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +  "Zapremnina: " + zapremnina + '\n' + "Cijena s PDV: " + priceWithPDV();
    }
}
