package org.fasttrackit;

public class Veterinarian {
    private String name;
    private String speciality;
    private String gender;
    private boolean goodDoctor = true;
    private boolean availability = true;
    private int age = 37;

    public Veterinarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isGoodDoctor() {
        return goodDoctor;
    }

    public void setGoodDoctor(boolean goodDoctor) {
        this.goodDoctor = goodDoctor;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
