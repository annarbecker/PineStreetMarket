package com.epicodus.pinestreetmarket;

/**
 * Created by Guest on 4/21/16.
 */
public class Eatery {

    private String name, description;
    private int logo;

    public Eatery() {

    }

    public Eatery(String name, String description, int logo) {
        this.name = name;
        this.description = description;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
