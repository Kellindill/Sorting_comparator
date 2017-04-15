package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Person[] authors = {
                new Person("Danielle", "Steel"),
                new Person("Tom", "Clancy"),
                new Person("Patricia", "Cornwell")
        };

        System.out.println("Original order:");
        for (Person author : authors) {
            System.out.println(author);
        }

        Arrays.sort(authors, new ComparePersons());

        System.out.println("\nOrder after sorting using comparator:");
        for(Person author : authors) {
            System.out.println(author);
        }

        Arrays.sort(authors);
        System.out.println("\nOrder after sorting using compareTo method:");
        for(Person author : authors) {
            System.out.println(author);
        }
    }
}
