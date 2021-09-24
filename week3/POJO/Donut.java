package com.company;

public class Donut {
    private String flavour, glaze_type;
    private int cost;

    public Donut(String flavour, String glaze_type, int cost) {
        this.flavour = flavour;
        this.glaze_type = glaze_type;
        this.cost = cost;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getGlaze_type() {
        return glaze_type;
    }

    public void setGlaze_type(String glaze_type) {
        this.glaze_type = glaze_type;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}