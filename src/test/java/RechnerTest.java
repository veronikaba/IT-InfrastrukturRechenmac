package test.java;

import main.java.Rechner;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

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

}
