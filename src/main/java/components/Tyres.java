package components;

public class Tyres extends Components {

    private double size;

    public Tyres(String brand, String model, double size) {
        super(brand, model);
        this.size = size;
    }

    public double getSize() {
        return this.size;
    }

}
