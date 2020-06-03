package people;

import behaviour.IBuy;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Customer implements IBuy {

    private double money;
    private ArrayList<Vehicle> vehicles;

    public Customer(double money) {
        this.money = money;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void buy(Vehicle vehicle) {
        if (money > vehicle.getPrice()) {
            money -= vehicle.getPrice();
            this.vehicles.add(vehicle);
        }

    }

    public int countVehicles() {
        return this.vehicles.size();
    }
}
