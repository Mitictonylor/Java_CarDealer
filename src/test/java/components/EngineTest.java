package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp() {
        engine = new Engine("Toyota","modelZ",150,"diesel");

    }

   @Test
    public void getBrand() {
        assertEquals("Toyota", engine.getBrand());
    }
    @Test
    public void getModel() {
        assertEquals("modelZ", engine.getModel());
    }
    @Test
    public void getHorsePower() {
        assertEquals(150, engine.getHorsePower());
    }

//
//    public void getFuel() {
//        assertEquals();
//    }
//
//

}