package org.fasttrackit;

import java.time.LocalDate;

public class AnimalFood {
    String name;
    String packageColor;
    String producer;

    double price;
    double quantity;

    boolean stockAvailability;
    boolean tasty = true;

    int recommendedQuantityPerDay = 400;


    LocalDate expirationDate;

    public AnimalFood(String name) {
        this.name = name;
    }
}
