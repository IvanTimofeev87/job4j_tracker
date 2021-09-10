package ru.job4j.tracker;

public class Doctor extends Profession {
    private String skills;

    private String nameOfHospital;

    public String placeOfWork() {
        return nameOfHospital;
    }
}
