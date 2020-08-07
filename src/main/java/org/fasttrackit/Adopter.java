package org.fasttrackit;

public class Adopter {
    private String name;
    private String job;

    private boolean goodPerson = true;
    private boolean ownsGarden = false;

    private double availableBudget;

    private int kids = 3;
    private int otherPets = 2;

    public Adopter(String name, boolean ownsGarden) {
        this.name = name;
        this.ownsGarden = ownsGarden;
    }

    public void feeding(Animal animal, AnimalFood animalFood) {

        System.out.println (this.name + " is feeding " + animal.getName()+ " some " + animalFood.getName() + " food.");


    }

    public void playingWithAnimal (RecreationalActivities activity, Animal animal){

        System.out.println(this.name + " is playing " + activity.getName() + " with " + animal.getName()+ ".");
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
