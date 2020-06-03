package components;

public class Engine extends Components {

    private int horsePower;
    private String fuel;

    public Engine(String brand, String model, int horsePower, String fuel) {
        super(brand, model);
        this.horsePower = horsePower;
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getFuel() {
        return fuel;
    }

}
