package org.fasttrackit;

public class Assistant extends Veterinarian{
    boolean collegeDegree = true;

    public Assistant(String name, boolean collegeDegree) {
        super(name);
        this.collegeDegree = collegeDegree;
    }
}
