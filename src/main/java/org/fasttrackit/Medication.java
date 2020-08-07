package org.fasttrackit;

public class Medication {
    private String type;
    private boolean isFree = true;
    private int quantityPerYear = 5;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public int getQuantityPerYear() {
        return quantityPerYear;
    }

    public void setQuantityPerYear(int quantityPerYear) {
        this.quantityPerYear = quantityPerYear;
    }
}
