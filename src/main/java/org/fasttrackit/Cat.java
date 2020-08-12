package org.fasttrackit;

public class Cat extends Animal{
    private String race;
    private String eyeColor;

    public Cat(String name) {
        super(name);
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    public void showHappiness(){
        System.out.println(getName() + " loves to purr.");
    }
}
