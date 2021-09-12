package ru.job4j.tracker;

public class Engineer extends Profession {
    private String area;

    public Engineer() {
    }

    public Engineer(String area) {
        this.area = area;
    }

    public  Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String getArea() {
        return area;
    }
}
