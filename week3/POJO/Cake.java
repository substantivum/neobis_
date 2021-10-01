package com.company;

public class Cake {

    private String flavour;
    private String cream; 
    private String color;
    private int id;
    private int layers;
    private int cost;

    public Cake(String flavour, String cream, String color, int id, int layers, int cost) {
        this.flavour = flavour;
        this.cream = cream;
        this.color = color;
	this.id = id;
        this.layers = layers;
        this.cost = cost;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getCream() {
        return cream;
    }

    public void setCream(String cream) {
        this.cream = cream;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
	return id;
    }

    public void setID(int id) {
	this.id = id;
    }

    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
