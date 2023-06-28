package kuy_8.Is_n_divisible_by_x_and_y

import junit.framework.TestCase.assertEquals
import org.junit.Test

class TestKata {
    @Test
    fun basicTests() {
        assertEquals(false, isDivisible(3, 3, 4))
        assertEquals(true, isDivisible(12, 3, 4))
        assertEquals(false, isDivisible(8, 3, 4))
        assertEquals(true, isDivisible(48, 3, 4))
        assertEquals(true, isDivisible(100, 5, 10))
        assertEquals(false, isDivisible(100, 5, 3))
        assertEquals(true, isDivisible(4, 4, 2))
        assertEquals(false, isDivisible(5, 2, 3))
        assertEquals(true, isDivisible(17, 17, 17))
        assertEquals(true, isDivisible(17, 1, 17))
    }
}