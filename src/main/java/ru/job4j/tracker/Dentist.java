package ru.job4j.tracker;

public class Dentist extends Doctor {
    private String cabinet;

    public Dentist(String cabinet, String hospital, String name, String surname, String education,
                   String birthday) {
        super(hospital, name, surname, education, birthday);
        this.cabinet = cabinet;
    }

    public String getCabinetNumber() {
        return cabinet;
    }
}
