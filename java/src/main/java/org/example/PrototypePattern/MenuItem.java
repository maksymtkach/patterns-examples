package org.example.PrototypePattern;

public abstract class MenuItem implements Cloneable {
    protected String name;
    protected double price;

    // У класі MenuItem не потрібен абстрактний метод clone()
    public String getName() { return name; }
    public double getPrice() { return price; }
}

