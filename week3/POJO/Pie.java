package com.company;

public class Pie {

    private String flavour;
    private String crustType;
    private String innerType;
    private int id;
    private int cost;

    public Pie(String flavour, String crustType, String innerType, int id, int cost) {
        this.flavour = flavour;
        this.crust_type = crustType;
        this.inner_type = innerType;
	this.id = id;
        this.cost = cost;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getCrustType() {
        return crustType;
    }

    public void setCrustType(String crustType) {
        this.crustType = crustType;
    }

    public String getInnerType() {
        return innerType;
    }

    public void setInnerType(String innerType) {
        this.innerType = innerType;
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
