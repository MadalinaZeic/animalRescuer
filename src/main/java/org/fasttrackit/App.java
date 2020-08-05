package org.fasttrackit;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Adopter human = new Adopter();
        AnimalFood meat = new AnimalFood();
        RecreationalActivities fetching = new RecreationalActivities();
        Veterinarian person = new Veterinarian();
        Game game = new Game();

        //Assigning valid values to dog
        dog.favoriteFoodName = "Chappy";
        dog.favoriteRecreationalActivity = "fetching";
        dog.name = "Sassy";
        dog.age = 3;
        dog.happinessLevel = 10;
        dog.healthLevel = 9;
        dog.hungerLevel = 5;

        //Assigning valid values to Adopter
        human.name = "Cher";
        human.availableBudget = 300;

        //Assigning valid values to AnimalFood
        meat.name = "Chappy";
        meat.expirationDate = LocalDate.of(2020,12,25);
        meat.price = 1.5;
        meat.stockAvailability = true;
        meat.quantity = 55.60;

        //Assigning valid values to RecreationalActivities
        fetching.name = "fetch";

        //Assigning valid values to Veterinarian
        person.name = "dr. Love";
        person.speciality = "surgeon";

        //Assigning valid values to Game
        game.adopter = human;
        game.dog = dog;
        game.veterinarian = person;
    }
}
