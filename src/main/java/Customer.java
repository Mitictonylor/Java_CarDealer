import vehicle.Vehicle;

import java.util.ArrayList;

public class Customer {

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

    public void addVehicles(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public int countVehicles(){
        return this.vehicles.size();
    }
}
