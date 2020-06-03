package components;

public abstract class Components {
    private String brand;
    private String model;

    public Components(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

}
