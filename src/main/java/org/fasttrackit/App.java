package org.fasttrackit;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Animal dog = new Animal("Lulu");
        Adopter human = new Adopter("John", false);
        AnimalFood meat = new AnimalFood("Royal Canin");
        RecreationalActivities fetching = new RecreationalActivities("fetching");
        Veterinarian person = new Veterinarian("Molly");
        Game game = new Game();

        //Assigning valid values to dog
        dog.setFavoriteFoodName("Chappy");
        dog.setFavoriteRecreationalActivity("fetching");
        dog.setName("Sassy");
        dog.setAge(3);
        dog.setHappinessLevel(10);
        dog.setHealthLevel(9);
        dog.setHungerLevel(5);

        //Assigning valid values to Adopter
        human.setName("Cher");
        human.setAvailableBudget(300);

        //Assigning valid values to AnimalFood
        meat.setName("Chappy");
        meat.setExpirationDate(LocalDate.of(2020,12,25));
        meat.setPrice(1.5);
        meat.setStockAvailability(true);
        meat.setQuantity(55.60);

        //Assigning valid values to RecreationalActivities
        fetching.setName("fetch");

        //Assigning valid values to Veterinarian
        person.setName("dr.Love");
        person.setSpeciality("surgeon");

        //Assigning valid values to Game
        game.setAdopter(human);
        game.setDog(dog);
        game.setVeterinarian(person);
    }
}
