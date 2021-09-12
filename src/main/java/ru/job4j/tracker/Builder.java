package ru.job4j.tracker;

public class Builder extends Engineer {
    private String constructionObject;

    public Builder() {
    }

    public Builder(String constructionObject) {
        this.constructionObject = constructionObject;
    }

    public Builder(String area) {
        super(area);
    }

    public String getConstructionObject() {
        return constructionObject;
    }
}
