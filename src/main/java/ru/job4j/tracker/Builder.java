package ru.job4j.tracker;

public class Builder extends Engineer {
    private String constructionObject;

    public Builder(String constructionObject, String name, String surname, String education, String birthday, String area) {
        super(name, surname, education, birthday, area);
        this.constructionObject = constructionObject;
    }

    public String getConstructionObject() {
        return constructionObject;
    }
}
