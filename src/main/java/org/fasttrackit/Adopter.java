package org.fasttrackit;

public class Adopter {
    String name;
    String job;

    boolean goodPerson = true;
    boolean ownsGarden = false;

    double availableBudget;

    int kids = 3;
    int otherPets = 2;

    public Adopter(String name, boolean ownsGarden) {
        this.name = name;
        this.ownsGarden = ownsGarden;
    }
}
