package vehicle;

import components.Components;
import components.Engine;
import components.Tyres;

import java.util.ArrayList;

public abstract class Vehicle {

    private String brand;
    private String model;
    private double price;
    private String colour;


    public Vehicle(String brand, String model, double price, String colour) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

}
