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


//    public void setBrand() {
//        assertEquals();
//    }
//
//
//    public void getModel() {
//        assertEquals();
//    }
//
//
//    public void setModel() {
//        assertEquals();
//    }
//
//
//    public void getHorsePower() {
//        assertEquals();
//    }
//
//
//    public void setHorsePower() {
//        assertEquals();
//    }
//
//
//    public void getFuel() {
//        assertEquals();
//    }
//
//
//    public void setFuel() {
//        assertEquals();
//    }
}