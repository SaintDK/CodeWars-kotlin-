package kuy_6.A_B_123

import org.junit.Test;
import org.junit.Assert.assertEquals;
import org.junit.Assert.assertTrue;

public class SolutionTests {

    private fun doIntTest(a: Int) {
        val b = Dinglemouse.int123(a);
        println("" + a + " + " + b + " = " + (a + b).toInt());
        assertTrue("B must be >= 0", b >= 0);
        assertEquals("A + B must give 123", 123, (a + b).toInt());
    }

    @Test
    fun testLess() {
        doIntTest(0);
    }

    @Test
    fun testSame() {
        doIntTest(123);
    }

    @Test
    fun testGreater() {
        doIntTest(500);
    }
}
