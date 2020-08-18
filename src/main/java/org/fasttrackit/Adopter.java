package org.fasttrackit;

public class Adopter {
    private String name;
    private String job;

    private boolean goodPerson = true;
    private boolean ownsGarden = false;

    private double availableBudget;

    private int kids = 3;
    private int otherPets = 2;

    public Adopter(){}
    public Adopter(String name, boolean ownsGarden) {
        this.name = name;
        this.ownsGarden = ownsGarden;
    }

    public void feeding(Animal animal, AnimalFood animalFood) {

        System.out.println(this.name + " is feeding " + animal.getName() + " some " + animalFood.getName() + " food.");
        int hungerLevel = animal.getHungerLevel();
        hungerLevel--;
        animal.setHungerLevel(hungerLevel);

        System.out.println(animal.getName() + "'s hunger level is at this point: " + animal.getHungerLevel());

        //changed fav food name to trigger if condition below
        animal.setFavoriteFoodName(animalFood.getName());

        if (animalFood.getName().equals(animal.getFavoriteFoodName())) {
            animal.setHappinessLevel(animal.getHappinessLevel() + 1);
            System.out.println(animal.getName() + "'s happiness level is now: " + animal.getHappinessLevel());
        }

    }

    public void playingWithAnimal(RecreationalActivities activity, Animal animal) {

        System.out.println(this.name + " is playing " + activity.getName() + " with " + animal.getName() + ".");
        int happinessLevel = animal.getHappinessLevel();
        happinessLevel++;
        animal.setHappinessLevel(happinessLevel);

        System.out.println(animal.getName() + "'s happiness level is at this point: " + animal.getHappinessLevel());

        int increment;
        if (activity.getName().equals(animal.getFavoriteFoodName())) {
            increment = 2;
        } else {
            increment = 1;
        }
        animal.setHappinessLevel(animal.getHappinessLevel() + increment);
        System.out.println(animal.getName() + "'s happiness level is currently: " + animal.getHappinessLevel());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public boolean isGoodPerson() {
        return goodPerson;
    }

    public void setGoodPerson(boolean goodPerson) {
        this.goodPerson = goodPerson;
    }

    public boolean isOwnsGarden() {
        return ownsGarden;
    }

    public void setOwnsGarden(boolean ownsGarden) {
        this.ownsGarden = ownsGarden;
    }

    public double getAvailableBudget() {
        return availableBudget;
    }

    public void setAvailableBudget(double availableBudget) {
        this.availableBudget = availableBudget;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public int getOtherPets() {
        return otherPets;
    }

    public void setOtherPets(int otherPets) {
        this.otherPets = otherPets;
    }
}
