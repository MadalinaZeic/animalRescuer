package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Adopter adopter;
    private Animal dog;
    private Veterinarian veterinarian;
    private List<AnimalFood> availableFood = new ArrayList<>();
    private RecreationalActivities[] availableActivities = new RecreationalActivities[3];

    private void initAnimalFood() {
        AnimalFood catFood = new AnimalFood("Royal Canin");
        AnimalFood kittenFood = new AnimalFood("Purina");
        availableFood.add(catFood);
        availableFood.add(kittenFood);
    }

    private void initRecreationalActivities() {
        RecreationalActivities activityX = new RecreationalActivities("Playing");
        RecreationalActivities activityY = new RecreationalActivities("Purring");
        RecreationalActivities activityZ = new RecreationalActivities("Jumping");

        availableActivities[0] = activityX;
        availableActivities[1] = activityY;
        availableActivities[2] = activityZ;

    }

    public void start() {
        initAnimalFood();
        initRecreationalActivities();

        displayAvailableFood();
        displayAvailableActivities();
    }

    private void displayAvailableFood() {
        System.out.println("Food availability: ");
        for (AnimalFood animalFood : availableFood) {
            if (animalFood != null) {
                System.out.println(animalFood.getName());
            }

        }

    }

    private void displayAvailableActivities() {
        System.out.println("Available activities: ");
        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                System.out.println(availableActivities[i].getName());
            }
        }
    }


    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Animal getDog() {
        return dog;
    }

    public void setDog(Animal dog) {
        this.dog = dog;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }
}

