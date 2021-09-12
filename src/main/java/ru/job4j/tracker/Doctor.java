package ru.job4j.tracker;

public class Doctor extends Profession {
    private String nameOfHospital;

    public  Doctor() {
    }

    public  Doctor(String nameOfHospital) {
        this.nameOfHospital = nameOfHospital;
    }

    public  Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String placeOfWork() {
        return nameOfHospital;
    }
}
