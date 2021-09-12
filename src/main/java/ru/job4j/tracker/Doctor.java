package ru.job4j.tracker;

public class Doctor extends Profession {
    private String nameOfHospital;

    public  Doctor() {
    }

    public  Doctor(String nameOfHospital) {
        this.nameOfHospital = nameOfHospital;
    }

    public String placeOfWork() {
        return nameOfHospital;
    }
}
