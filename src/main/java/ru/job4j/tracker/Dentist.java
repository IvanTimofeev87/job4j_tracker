package ru.job4j.tracker;

public class Dentist extends Doctor {
    private String cabinetNumber;

    public Dentist() {
    }

    public Dentist(String cabinetNumber) {
        this.cabinetNumber = cabinetNumber;
    }

    public Dentist(String nameOfHospital) {
        super(nameOfHospital);
    }

    public String getCabinetNumber() {
        return cabinetNumber;
    }
}
