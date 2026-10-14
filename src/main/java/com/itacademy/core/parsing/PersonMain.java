package com.itacademy.core.parsing;

public class PersonMain {
    public static void main(String[] args) {

        String tekst = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";
         String[] osobe = tekst.split(" ");

         Person[] osobeObjekti = new Person[3];

        for (int i = 0; i < osobe.length; i++) {
            String[] podatci = osobe[i].split("/");

            String [] imePrezime = podatci[0].split("\\.");

            String ime = imePrezime[0];
            String prezime = imePrezime[1];
            String grad = podatci[1];

            osobeObjekti[i]  = new Person(ime, prezime, grad);
        }
        for (Person p : osobeObjekti){
            System.out.println(p);
        }

    }
}
