package org.fasttrackit;

public class Receptionist extends Veterinarian{
   private boolean empathy = true;

    public Receptionist(String name, boolean empathy) {
        super(name);
        this.empathy = empathy;
    }

    public boolean isEmpathy() {
        return empathy;
    }

    public void setEmpathy(boolean empathy) {
        this.empathy = empathy;
    }
}
