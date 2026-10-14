package com.itacademy.core.product;

public class Main {
    public static void main(String[] args) {

//        Product product = new Product();
        Product chocolate = new Chocolate("Milka", 232443324, 25.5, 250);
        System.out.println(chocolate);
        System.out.println();
        Product wine = new Wine("Babic", 344225,33.3,0.7);
        System.out.println(wine);
    }
}
