package vehicle;


import behaviour.IDamage;

public abstract class Vehicle implements IDamage {

    private String brand;
    private String model;
    private double price;
    private String colour;


    public Vehicle(String brand, String model, double price, String colour)  {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
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
    public void damage(double damageValue){
        this.setPrice(this.getPrice() - damageValue);
    }
}
