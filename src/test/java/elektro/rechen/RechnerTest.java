package elektro.rechen;

import elektro.rechen.Rechner;
import org.junit.*;

import static org.junit.Assert.assertEquals;

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

}
