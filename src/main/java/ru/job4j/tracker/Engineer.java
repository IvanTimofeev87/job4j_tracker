package ru.job4j.tracker;

public class Engineer extends Profession {
    private String area;

    public Engineer() {
    }

    public Engineer(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }
}
