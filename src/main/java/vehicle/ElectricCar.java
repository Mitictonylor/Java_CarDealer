package vehicle;

import components.Engine;
import components.Tyres;

public class ElectricCar extends Car{

    public ElectricCar(String brand, String model, double price, String colour, Engine engine, Tyres tyres) {
        super(brand, model, price, colour, engine, tyres);
    }

}

