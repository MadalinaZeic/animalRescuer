package org.fasttrackit;

public class Kittens extends Cat {
    private String furColor;

    public Kittens(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    public void showHappiness(){
        System.out.println(getName() + " enjoys playing and running.");}

}
