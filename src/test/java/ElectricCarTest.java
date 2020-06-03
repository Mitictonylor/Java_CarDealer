import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    ElectricCar electricCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void setUp() {
        engine = new Engine("Toyota", "modelZ", 150, "electric");
        tyres = new Tyres("Pirelli","cinturato", 17.5);
        electricCar = new ElectricCar("Toyota", "Aygo",12000.0,"black", engine, tyres);
    }
    @Test
    public void getName() {
        assertEquals("Toyota", electricCar.getBrand());
    }

    @Test
    public void getModel() {
        assertEquals("Aygo", electricCar.getModel());
    }

    @Test
    public void getPrice() {
        assertEquals(12000.0, electricCar.getPrice(), 0.01);
    }

    @Test
    public void getColour() {
        assertEquals("black", electricCar.getColour());
    }

    @Test
    public void getEngineFuel() {
        assertEquals("electric", electricCar.getEngine().getFuel());
    }

    @Test
    public void getTyresSize() {
        assertEquals(17.5, electricCar.getTyres().getSize(), 0.01);
    }
}