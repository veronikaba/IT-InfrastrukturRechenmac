package elektro.rechen;

import elektro.rechen.Rechner;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class RechnerTest {

    private static Rechner rechner;

    @BeforeClass
    public static void setUp() {
        rechner = new Rechner();
    }

    @Test
    public void smokeTestPlus() {
        assertEquals(rechner.plus(2, 3), 5);
    }

    @Test
    public void smokeTestMinus() { assertEquals(rechner.minus(4,2), 2);}

    @Test
    public void smokeTestMal() { assertTrue(rechner.mal(5, 7)==35); }

    @Test
    public void smokeTestGeteilt() { assertTrue(rechner.geteilt(12, 4)==3); }

    @Test
    public void smokeTestHoch() { assertTrue(rechner.hoch(4,3) ==64);}
}
