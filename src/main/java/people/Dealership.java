package people;

import behaviour.IBuy;
import behaviour.ISell;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership implements IBuy, ISell {

    private double till;
    private ArrayList<Vehicle> vehicles;

    public Dealership(double till) {
        this.till = till;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void buy(Vehicle vehicle) {
        if (till > vehicle.getPrice()) {
            till -= vehicle.getPrice();
            this.vehicles.add(vehicle);
        }
    }

    public int countVehicle() {
        return this.vehicles.size();
    }

    public void sell(Vehicle vehicle) {
        if (this.vehicles.contains(vehicle)) {
            this.till += vehicle.getPrice();
            this.vehicles.remove(vehicle);
        }
    }


}
