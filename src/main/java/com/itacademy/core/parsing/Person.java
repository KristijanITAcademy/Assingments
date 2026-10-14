package com.itacademy.core.parsing;

public class Person {

    public String name;
    public String surname;
    public String placeOfBirth;

    public Person(String name, String surname, String placeOfBirth) {
        this.name = name;
        this.surname = surname;
        this.placeOfBirth = placeOfBirth;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + placeOfBirth;
        }
}
