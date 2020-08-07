package org.fasttrackit;

public class RecreationalActivities {
   private String name;
   private String activity;
   private String location;
   private boolean healthy = true;
   private int funHoursPerDay = 3;

    public RecreationalActivities (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public int getFunHoursPerDay() {
        return funHoursPerDay;
    }

    public void setFunHoursPerDay(int funHoursPerDay) {
        this.funHoursPerDay = funHoursPerDay;
    }
}
