package ru.job4j.tracker;

public class Surgeon extends Doctor {
    private String operation;

    public Surgeon(String operation, String hospital, String name, String surname, String education,
                   String birthday) {
        super(hospital, name, surname, education, birthday);
        this.operation = operation;
    }

    public String getDateOfOperation() {
        return operation;
    }
}
