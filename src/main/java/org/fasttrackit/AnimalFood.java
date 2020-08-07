package org.fasttrackit;

import java.time.LocalDate;

public class AnimalFood {
    private String name;
    private String packageColor;
    private String producer;
    private double price;
    private double quantity;
    private boolean stockAvailability;
    private boolean tasty = true;
    private int recommendedQuantityPerDay = 400;
    private LocalDate expirationDate;

    public AnimalFood(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageColor() {
        return packageColor;
    }

    public void setPackageColor(String packageColor) {
        this.packageColor = packageColor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public boolean isStockAvailability() {
        return stockAvailability;
    }

    public void setStockAvailability(boolean stockAvailability) {
        this.stockAvailability = stockAvailability;
    }

    public boolean isTasty() {
        return tasty;
    }

    public void setTasty(boolean tasty) {
        this.tasty = tasty;
    }

    public int getRecommendedQuantityPerDay() {
        return recommendedQuantityPerDay;
    }

    public void setRecommendedQuantityPerDay(int recommendedQuantityPerDay) {
        this.recommendedQuantityPerDay = recommendedQuantityPerDay;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}
