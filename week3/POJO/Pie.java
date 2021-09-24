package com.company;

public class Pie {

    private String flavour, crust_type, inner_type;
    private int id, cost;

    public Pie(String flavour, String crust_type, String inner_type, int id, int cost) {
        this.flavour = flavour;
        this.crust_type = crust_type;
        this.inner_type = inner_type;
	this.id = id;
        this.cost = cost;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getCrust_type() {
        return crust_type;
    }

    public void setCrust_type(String crust_type) {
        this.crust_type = crust_type;
    }

    public String getInner_type() {
        return inner_type;
    }

    public void setInner_type(String inner_type) {
        this.inner_type = inner_type;
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
