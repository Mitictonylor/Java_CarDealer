import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.Vehicle;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Vehicle vehicle;
    Tyres tyres;
    Engine engine;

    @Before
    public void setUp() {
        customer = new Customer(30000.00);
        engine = new Engine("Toyota", "modelZ", 150, "diesel");
        tyres = new Tyres("Pirelli", "cinturato", 17.5);
        vehicle = new Car("Toyota", "Aygo",12000.0,"black", engine, tyres);

    }

    @Test
    public void canAddACar() {
        assertEquals(0, customer.countVehicles());
        customer.addVehicles(vehicle);
        assertEquals(1, customer.countVehicles());
    }
}
