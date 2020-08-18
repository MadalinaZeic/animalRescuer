package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {

    private static final int MAX_LEVEL = 10;
    private static final int MIN_LEVEL = 100;
    private static final int MAX_ITERATIONS = 2;

    private Adopter adopter;
    private Animal dog;
    private Veterinarian veterinarian;
    private List<AnimalFood> availableFood = new ArrayList<>();
    private RecreationalActivities[] availableActivities = new RecreationalActivities[3];

    Animal wolfDog;
    Adopter rescuer;

    private void initAnimal() {
        wolfDog = new Animal();
        wolfDog.setFavoriteFoodName("Royal Canin");
        wolfDog.setFavoriteRecreationalActivity("Fetching");
        wolfDog.setColor("Black");
        wolfDog.setShape("Athletic");
        wolfDog.setAge(3);
        wolfDog.setHungerLevel(MAX_LEVEL - 1);
        wolfDog.setHappinessLevel(1);

    }

    private void initRescuer() {
        rescuer = new Adopter();
        rescuer.setName(readRescuerName());

    }

    private String readRescuerName() {
        System.out.println("Please type your name and press Enter.");

        Scanner scanner = new Scanner(System.in);
        String rescuerName;
        try {
            rescuerName = scanner.nextLine();
        } catch (InputMismatchException exception) {
            System.out.println("Please enter valid name!");
            return readRescuerName();
        }


        System.out.println("Welcome " + rescuerName);
        System.out.println("-----------------------");
        return rescuerName;
    }

    private void nameAnimal() {
        System.out.println("Please give your rescued animal a name.");

        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();
        wolfDog.setName(animalName);
        System.out.println(wolfDog.getName() + " barks: Thank you!");
        System.out.println("-----------------------");

    }


    private void initAnimalFood() {
        AnimalFood catFood = new AnimalFood("Royal Canin");
        AnimalFood kittenFood = new AnimalFood("Purina");
        availableFood.add(catFood);
        availableFood.add(kittenFood);

        displayAvailableFood();
    }

    private void initRecreationalActivities() {
        RecreationalActivities activityX = new RecreationalActivities("Playing");
        RecreationalActivities activityY = new RecreationalActivities("Purring");
        RecreationalActivities activityZ = new RecreationalActivities("Jumping");

        availableActivities[0] = activityX;
        availableActivities[1] = activityY;
        availableActivities[2] = activityZ;

        displayAvailableActivities();
    }

    public void start() {
        initAnimal();
        initRecreationalActivities();
        initAnimalFood();
        initRescuer();

        nameAnimal();


        for (int i = 1; i <= MAX_ITERATIONS; i++) {
            requireActivity();
            requireFeeding();

            if (i % 3 == 0) {
                wolfDog.setHungerLevel(wolfDog.getHungerLevel() + 1);
                wolfDog.setHappinessLevel(wolfDog.getHappinessLevel() - 1);
                System.out.println("-----------------------");
                System.out.println(wolfDog.getName() + " is getting hungry and restless.");
                System.out.println("Hunger level is: " + wolfDog.getHungerLevel());
                System.out.println("Happiness level is: " + wolfDog.getHappinessLevel());
                System.out.println("-----------------------");
            }

            if (i == MAX_ITERATIONS) {
                if (MIN_LEVEL < wolfDog.getHungerLevel()) {
                    throw new RuntimeException("Game over. " + wolfDog.getName() + " is too poorly fed.");
                }

                if (MIN_LEVEL < wolfDog.getHappinessLevel()) {
                    throw new RuntimeException("Game over. " + wolfDog.getName() + " is too poorly entertained.");
                }

                System.out.println("Congratulations! " + wolfDog.getName() + " has been fed and entertained well enough.");
            }
        }


}

    private String readFoodName() {
        System.out.println("Please select food...");

        Scanner scanner = new Scanner(System.in);
        String foodName = scanner.nextLine();

        System.out.println("Selected:  " + foodName);

        List<String> availableFoodNames = new ArrayList<>();

        for (AnimalFood food : availableFood) {
            availableFoodNames.add(food.getName());
        }

        if (!availableFoodNames.contains(foodName)) {
            System.out.println(foodName + " is not available as a food type in this game.");
            return readFoodName();
        }

        System.out.println("-----------------------");

        return foodName;
    }

    private void requireFeeding() {
        System.out.println(wolfDog.getName() + "'s hunger level is: " + wolfDog.getHungerLevel() + ". Please select food.");

        displayAvailableFood();
        String foodName = readFoodName();
        AnimalFood food = new AnimalFood(foodName);

        rescuer.feeding(wolfDog, food);

        System.out.println("-----------------------");

    }

    private String readActivityName() {
        System.out.println("Please select activity...");

        Scanner scanner = new Scanner(System.in);
        String activityName = scanner.nextLine();

        System.out.println("Selected:  " + activityName);

        List<String> availableActivityNames = new ArrayList<>();

        for (RecreationalActivities activity : availableActivities) {
            if (activity != null) {
                availableActivityNames.add(activity.getName());
            }
        }

        if (!availableActivityNames.contains(activityName)) {
            System.out.println(activityName + " is not available in this game.");
            return readActivityName();
        }

        System.out.println("-----------------------");

        return activityName;
    }

    private void requireActivity() {
        System.out.println(wolfDog.getName() + "'s happiness level is: " + wolfDog.getHappinessLevel() + ". Please select recreational activity.");

        displayAvailableActivities();

        String activityName = readActivityName();

        RecreationalActivities activity = new RecreationalActivities(activityName);

        rescuer.playingWithAnimal(activity, wolfDog);

        System.out.println("-----------------------");
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

