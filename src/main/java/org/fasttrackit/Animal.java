package org.fasttrackit;

public class Animal {
    private String name;
    private String favoriteFoodName;
    private String favoriteRecreationalActivity;
    private String color;
    private String shape;
    private int age;
    private int healthLevel = 9;
    private int hungerLevel = 5;
    private int happinessLevel = 10;
    private boolean neutered = true;
    private boolean goodBoy = true;
    private double weight = 20.5;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteFoodName() {
        return favoriteFoodName;
    }

    public void setFavoriteFoodName(String favoriteFoodName) {
        this.favoriteFoodName = favoriteFoodName;
    }

    public String getFavoriteRecreationalActivity() {
        return favoriteRecreationalActivity;
    }

    public void setFavoriteRecreationalActivity(String favoriteRecreationalActivity) {
        this.favoriteRecreationalActivity = favoriteRecreationalActivity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public boolean isGoodBoy() {
        return goodBoy;
    }

    public void setGoodBoy(boolean goodBoy) {
        this.goodBoy = goodBoy;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void showHappiness(){
        System.out.println(name + " is feeling playful.");
    }
}
