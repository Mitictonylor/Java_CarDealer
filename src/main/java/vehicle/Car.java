package vehicle;

import components.Engine;
import components.Tyres;

public class Car extends Vehicle {

    private Engine engine;
    private Tyres tyres;

    public Car(String brand, String model, double price, String colour, Engine engine, Tyres tyres) {
        super(brand, model, price, colour);
        this.engine = engine;
        this.tyres = tyres;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }
}
