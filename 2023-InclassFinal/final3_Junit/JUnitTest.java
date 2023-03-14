package final3_Junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @Test
    void testMax() {
        Singlecompare comp = new Singlecompare();
        assertEquals(-5, comp.max(-10, -5));
        assertEquals(-12, comp.max(-12, -15)); // assume abnormal case
        assertEquals(30, comp.max(10, 30));
        assertEquals(20, comp.max(20, 12));
        assertEquals(3, comp.max(3, 3));
        assertEquals(-7, comp.max(-7, -7));
    }

    @Test
    void testMax1() {
        Singlecompare comp1 = new Singlecompare();
        assertEquals(25, comp1.max(25,10));
    }
}
