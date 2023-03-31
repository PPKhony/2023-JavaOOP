/*
 * Java Naming Convention
 * Test method ขึ้นต้นด้วย test
 * Test classed ลงท้ายด้วย Test ex.MyClassTest
 */
package final3_Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class SingleJUnitTest {

    @BeforeEach
    void setup() {
         System.out.println("Before Test");
    }

    @AfterEach 
    void after() {
        System.out.println("After Test");
    }
    @Test
    void testMax() {
        Singlecompare comp = new Singlecompare();
        assertEquals(-5, comp.max(-10, -5));
        assertEquals(-12, comp.max(-12, -15)); // assume abnormal case
        assertEquals(30, comp.max(10, 30));
        assertEquals(20, comp.max(20, 12));
        assertEquals(3, comp.max(3, 3));
        assertEquals(-1, comp.max(-7, -1));
        for (int i = 0; i < 150; i++) {
            assertEquals(i, comp.max(i-1, i)); 
        }
    }

    @Test
    void testMax1() {
        Singlecompare comp1 = new Singlecompare();
        assertEquals(25, comp1.max(25,10));
    }
    
    @Disabled
    @Test
    void testIsThesame() {fail("Not yet implement");}

    
}
