package ru.job4j.tracker;

public class Surgeon extends Doctor {
    private String dateOfOperation;

    public Surgeon(String dateOfOperation) {
        this.dateOfOperation = dateOfOperation;
    }

    public String getDateOfOperation() {
        return dateOfOperation;
    }
}
