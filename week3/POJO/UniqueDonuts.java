package com.company;

public class UniqueDonuts {

    private String flavour;
    private String glaze_type;
    private int id;
    private int cost;

    public UniqueDonuts(String flavour, String glaze_type, int id, int cost) {
        this.flavour = flavour;
        this.glazeType = glazeType;
        this.id = id;
        this.cost = cost;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getGlazeType() {
        return glazeType;
    }

    public void setGlazeType(String glazeType) {
        this.glazeType = glazeType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
