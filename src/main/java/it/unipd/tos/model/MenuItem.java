package it.unipd.tos.model;

public class MenuItem {
    public enum itemType { Panino, Fritto, Bevanda }
    private itemType item;
    private String name;
    private double price;

    public MenuItem(String n, itemType i, double p) {
        this.item = i;
        this.name = n;
        this.price = p;
    }

    public String getName() {
        return name;
    }

    public itemType getType() {
        return item;
    }

    public double getPrice() {
        return price;
    }
}