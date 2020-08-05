package org.fasttrackit;

public class Receptionist extends Veterinarian{
    boolean empathy = true;

    public Receptionist(String name, boolean empathy) {
        super(name);
        this.empathy = empathy;
    }
}
