package kuy_7.SquarePis

import junit.framework.TestCase.assertEquals
import org.junit.Test
// You can use JUnit
class Tests {
    @Test
    fun fixedTests() {
        assertEquals(8, squarePi(5))
        assertEquals(15, squarePi(10))
    }
}
