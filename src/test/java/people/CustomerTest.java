package people;

import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicle.Car;
import vehicle.Vehicle;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Vehicle vehicle;
    Tyres tyres;
    Engine engine;
    Vehicle vehicle2;

    @Before
    public void setUp() {
        customer = new Customer(30000.00);
        engine = new Engine("Toyota", "modelZ", 150, "diesel");
        tyres = new Tyres("Pirelli", "cinturato", 17.5);
        vehicle = new Car("Toyota", "Aygo", 12000.0, "black", engine, tyres);
        vehicle2 = new Car("Ferrari", "f1", 1200000000.0, "black", engine, tyres);

    }

    @Test
    public void carListStartEmpty() {
        assertEquals(0, customer.countVehicles());
    }

    @Test
    public void canBuyACar___enoughMoney() {
        customer.buy(vehicle);
        assertEquals(18000.00, customer.getMoney(), 0.01);
        assertEquals(1, customer.countVehicles());

    }

    @Test
    public void canBuyACar___NotEnoughMoney() {
        customer.buy(vehicle2);
        assertEquals(30000.00, customer.getMoney(), 0.01);
        assertEquals(0, customer.countVehicles());
    }
}
