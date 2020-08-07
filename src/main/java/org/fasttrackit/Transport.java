package org.fasttrackit;

public class Transport {
    private String vehicle;
    private boolean driverAvailability = true;
    private boolean isFree = true;

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isDriverAvailability() {
        return driverAvailability;
    }

    public void setDriverAvailability(boolean driverAvailability) {
        this.driverAvailability = driverAvailability;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}
