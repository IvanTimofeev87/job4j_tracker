package ru.job4j.tracker;

public class Engineer extends Profession {
    private String area;

    public Engineer(String name, String surname, String education, String birthday,
                    String area) {
        super(name, surname, education, birthday);
        this.area = area;
    }

    public String getArea() {
        return area;
    }
}
