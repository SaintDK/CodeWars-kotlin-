package kuy_8.Opposite_number

import junit.framework.TestCase.assertEquals
import org.junit.Test

class OppositeExampleTests {

    @Test fun testFixed() {
        assertEquals(-1, opposite(1));
        assertEquals(0, opposite(0));
        assertEquals(25, opposite(-25));
    }
}