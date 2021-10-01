package com.company;

public class Donut {
    private String flavour;
    private String glazeType;
    private int id;
    private int cost;

    public Donut(String flavour, String glazeType, int id, int cost) {
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

    public void setID(int id) {
	this.id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
