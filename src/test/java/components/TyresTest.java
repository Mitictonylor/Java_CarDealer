package components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TyresTest {

    Tyres tyres;

    @Before
    public void setUp() {
        tyres = new Tyres("Pirelli","cinturato",17.0);
    }

    @Test
    public void getBrand() {
        assertEquals("Pirelli", tyres.getBrand());
    }

    @Test
    public void getModel() {
        assertEquals("cinturato", tyres.getModel());
    }


}