import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import people.Dealership;
import vehicle.Car;
import vehicle.Vehicle;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
    Dealership dealership;
    Vehicle vehicle;
    Vehicle vehicle2;
    Tyres tyres;
    Engine engine;

    @Before
    public void setUp() {
        dealership = new Dealership(300000.00);
        engine = new Engine("Toyota", "modelZ", 150, "diesel");
        tyres = new Tyres("Pirelli", "cinturato", 17.5);
        vehicle = new Car("Toyota", "Aygo",12000.0,"black", engine, tyres);
        vehicle2 = new Car("Ferrari", "f1",1200000000.0,"black", engine, tyres);
    }

    @Test
    public void carListStartEmpty() {
        assertEquals(0, dealership.countVehicle());
    }
    @Test
    public void canBuyACar___enoughMoney() {
        dealership.buy(vehicle);
        assertEquals(288000.00, dealership.getTill(),0.01);
        assertEquals(1, dealership.countVehicle());

    }
    @Test
    public void canBuyACar___NotEnoughMoney() {
        dealership.buy(vehicle2);
        assertEquals(300000.00, dealership.getTill(),0.01);
        assertEquals(0, dealership.countVehicle());
    }
}
