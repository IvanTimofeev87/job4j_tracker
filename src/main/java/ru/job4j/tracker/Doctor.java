package ru.job4j.tracker;

public class Doctor extends Profession {
    private String hospital;

    public  Doctor(String hospital, String name, String surname, String education,
                   String birthday) {
        super(name, surname, education, birthday);
        this.hospital = hospital;
    }

    public String placeOfWork() {
        return hospital;
    }
}
