package ru.job4j.tracker;

public class Programmer extends Engineer {
    private String programmingLanguage;

    public Programmer(String programmingLanguage, String name) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}
