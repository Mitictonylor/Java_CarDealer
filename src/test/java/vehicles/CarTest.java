package vehicles;

import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicle.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;
    Engine engine;
    Tyres tyres;

    @Before
    public void setUp() {
        engine = new Engine("Toyota", "modelZ", 150, "diesel");
        tyres = new Tyres("Pirelli", "cinturato", 17.5);
        car = new Car("Toyota", "Aygo", 12000.0, "black", engine, tyres);
    }

    @Test
    public void getName() {
        assertEquals("Toyota", car.getBrand());
    }

    @Test
    public void getModel() {
        assertEquals("Aygo", car.getModel());
    }

    @Test
    public void getPrice() {
        assertEquals(12000.0, car.getPrice(), 0.01);
    }

    @Test
    public void getColour() {
        assertEquals("black", car.getColour());
    }

    @Test
    public void getEngineName() {
        assertEquals("Toyota", car.getEngine().getBrand());
    }

    @Test
    public void getTyresSize() {
        assertEquals(17.5, car.getTyres().getSize(), 0.01);
    }

    @Test
    public void priceLooseValueBecauseOfDamage() {
        car.damage(2000.00);
        assertEquals(10000.00, car.getPrice(), 0.01);
    }
}
