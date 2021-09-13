package ru.job4j.tracker;

public class Programmer extends Engineer {
    private String programmingLanguage;

    public Programmer(String programmingLanguage, String name, String surname, String education,
                      String birthday, String area) {
        super(name, surname, education, birthday, area);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}
