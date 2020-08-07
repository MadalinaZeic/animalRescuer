package org.fasttrackit;

public class Assistant extends Veterinarian{
    private boolean collegeDegree = true;

    public Assistant(String name, boolean collegeDegree) {
        super(name);
        this.collegeDegree = collegeDegree;
    }

    public boolean isCollegeDegree() {
        return collegeDegree;
    }

    public void setCollegeDegree(boolean collegeDegree) {
        this.collegeDegree = collegeDegree;
    }
}
